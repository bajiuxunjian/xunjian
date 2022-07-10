package org.xunjian.model;

import java.util.Date;
import lombok.Data;

/**
 * @author xiangshuai
 * @date 2022/7/10
 */
@Data
public class HospitalConfigMapping {
    private Long id;

    private Long hospitalConfigId;

    private Long configId;

    private Date createTime;

    private Date updateTime;
}