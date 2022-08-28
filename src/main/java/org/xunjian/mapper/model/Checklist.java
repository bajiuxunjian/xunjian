package org.xunjian.mapper.model;

import java.util.Date;
import lombok.Data;

@Data
public class Checklist {
    private Integer id;

    private String name;

    /**
     * 最后更新时间
     */
    private Date updatetime;

    /**
     * 一个大json展示检测详情
     */
    private String inspect;

    /**
     * 当前检测项拥有哪些检测配置
     */
    private String inspectConfig;

    /**
     * 属于哪一个医院
     */
    private Integer hospitalId;

    /**
     * 1为日检2为月检3为年检
     */
    private Integer type;

    /**
     * 1为全部检测完成
     */
    private Integer status;
}