package org.xunjian.mapper;

import java.util.List;

import org.xunjian.model.HospitalConfig;

/**
 * @author xiangshuai
 * @date 2022/7/10
 */
public interface HospitalConfigMapper {
    int deleteByPrimaryKey(Long id);

    int insert(HospitalConfig record);

    int insertSelective(HospitalConfig record);

    HospitalConfig selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(HospitalConfig record);

    int updateByPrimaryKey(HospitalConfig record);

   List<HospitalConfig> listByAll(HospitalConfig hospitalConfig);

}
