package org.xunjian.model;

import java.util.Date;
import lombok.Data;

/**
 * @author xiangshuai
 * @date 2022/7/10
 */
@Data
public class Config {
    private Long id;

    private String name;

    private String inspectFunction;

    /**
     * 是否需要上传图片
     */
    private Boolean needImage;

    private Date updateTime;

    private Date createTime;

    private String purpose;

    private String body;
}