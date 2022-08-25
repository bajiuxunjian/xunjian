package org.xunjian.mapper.model;

import java.util.Date;
import lombok.Data;

/**
 * @author xiangshuai
 * @date 2022/7/10
 */
@Data
public class Report {
    private Long id;

    private Long hospitalConfigId;

    private Date createTime;

    private Date updateTime;

    private String body;

    private Date dt;
}