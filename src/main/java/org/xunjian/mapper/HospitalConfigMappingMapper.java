package org.xunjian.mapper;

import org.xunjian.model.HospitalConfigMapping;

/**
 * @author xiangshuai
 * @date 2022/7/10
 */
public interface HospitalConfigMappingMapper {
    int deleteByPrimaryKey(Long id);

    int insert(HospitalConfigMapping record);

    int insertSelective(HospitalConfigMapping record);

    HospitalConfigMapping selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(HospitalConfigMapping record);

    int updateByPrimaryKey(HospitalConfigMapping record);
}