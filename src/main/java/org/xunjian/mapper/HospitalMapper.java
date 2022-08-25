package org.xunjian.mapper;

import java.util.List;

import org.xunjian.mapper.model.Hospital;

/**
 * @author xiangshuai
 * @date 2022/7/10
 */
public interface HospitalMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Hospital record);

    int insertSelective(Hospital record);

    Hospital selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Hospital record);

    int updateByPrimaryKey(Hospital record);

    List<Hospital> listByAll(Hospital hospital);


}
