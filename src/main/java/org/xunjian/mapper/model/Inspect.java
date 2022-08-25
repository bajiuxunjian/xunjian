package org.xunjian.mapper.model;

import lombok.Data;

@Data
public class Inspect {
    private Integer id;

    /**
    * 检测目的

    */
    private String goal;

    /**
    * 实验方法
    */
    private String method;

    /**
    * 性能要求
    */
    private String require;

    /**
    * 检测名称
    */
    private String name;

    /**
    * 年检
    */
    private Integer year;

    /**
    * 月检
    */
    private Integer month;

    /**
    * 日检
    */
    private Integer day;
}