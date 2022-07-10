create table config
(
    id               bigint auto_increment
        primary key,
    name             varchar(255) null,
    inspect_function text         not null,
    need_image       tinyint(1)   null comment '是否需要上传图片',
    update_time      datetime     null,
    create_time      datetime     null,
    purpose          text         null,
    body             text         null,
    constraint config_id_uindex
        unique (id),
    constraint config_name_uindex
        unique (name)
);

create table hospital
(
    id          bigint auto_increment
        primary key,
    name        varchar(255) null,
    position    text         null,
    phone       varchar(255) null,
    description text         null,
    create_time datetime     null comment '记录创建时间',
    update_time datetime     null comment '记录更新时间',
    constraint hospital_id_uindex
        unique (id),
    constraint hospital_name_uindex
        unique (name)
);

create table hospital_config
(
    id          bigint auto_increment
        primary key,
    hospital_id bigint   null comment '外键关联医院id',
    type        int      null comment '质检类型:1:日检,2:月检,3:年检',
    create_time datetime null,
    update_time datetime null,
    status      int      null,
    constraint hospital_config_hospital_id_type_uindex
        unique (hospital_id, type),
    constraint hospital_config_id_uindex
        unique (id),
    constraint hospital_config_hospital_id_fk
        foreign key (hospital_id) references hospital (id)
);

create table hospital_config_mapping
(
    id                 bigint auto_increment
        primary key,
    hospital_config_id bigint   null,
    config_id          bigint   null,
    create_time        datetime null,
    update_time        datetime null,
    constraint hospital_config_mapping_id_uindex
        unique (id),
    constraint hospital_config_mapping_config_id_fk
        foreign key (config_id) references config (id),
    constraint hospital_config_mapping_hospital_config_id_fk
        foreign key (hospital_config_id) references hospital_config (id)
);

create table report
(
    id                 bigint auto_increment
        primary key,
    hospital_config_id bigint   null,
    create_time        datetime null,
    update_time        datetime null,
    body               text     null,
    dt                 date     null,
    constraint report_id_uindex
        unique (id),
    constraint report_hospital_config_id_fk
        foreign key (hospital_config_id) references hospital_config (id)
);

