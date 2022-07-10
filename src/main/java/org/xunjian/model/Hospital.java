package org.xunjian.model;

import java.util.Date;

import io.swagger.annotations.ApiParam;
import lombok.Data;

/**
 * @author xiangshuai
 * @date 2022/7/10
 */
@Data
public class Hospital {
    private Long id;

    private String name;

    private String position;

    private String phone;

    private String description;
    /**
     * 记录创建时间
     */
    @ApiParam("仅用于查询")
    private Date createTime;

    /**
     * 记录更新时间
     */
    @ApiParam("仅用于查询")
    private Date updateTime;
}
