package org.xunjian.mapper;
import org.apache.ibatis.annotations.Param;

import org.xunjian.mapper.model.HospitalList;

import java.util.List;

public interface HospitalListMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HospitalList record);

    int insertSelective(HospitalList record);

    HospitalList selectByPrimaryKey(Integer id);
    List<HospitalList> selectByAll(HospitalList hospitalList);

    int updateByPrimaryKeySelective(HospitalList record);

    int updateByPrimaryKey(HospitalList record);

    List<HospitalList> listByAll(HospitalList hospitalList);

}