package org.xunjian.mapper.model;

import lombok.Data;

@Data
public class HospitalList {
    private Integer id;

    private String name;

    private String description;

    /**
    * 日检配置
    */
    private String dayConfig;

    /**
    * 年检配置
    */
    private String yearConfig;

    /**
    * 月检配置
    */
    private String monthConfig;
}