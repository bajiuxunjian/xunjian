package org.xunjian.model;

import java.util.Date;
import lombok.Data;

/**
 * @author xiangshuai
 * @date 2022/7/10
 */
@Data
public class HospitalConfig {
    private Long id;

    /**
     * 外键关联医院id
     */
    private Long hospitalId;

    /**
     * 质检类型:1:日检,2:月检,3:年检
     */
    private Integer type;

    private Date createTime;

    private Date updateTime;

    private Integer status;
}