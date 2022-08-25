package org.xunjian.mapper.model;

import lombok.Data;

@Data
public class User {
    private Integer id;

    private String username;

    /**
     * 角色 1为管理员 2为普通人
     */
    private Integer role;

    private String password;

    /**
     * 此用户为哪个医院下
     */
    private Integer fromHospitalId;
}