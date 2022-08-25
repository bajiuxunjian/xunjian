package org.xunjian.mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import org.xunjian.mapper.model.Inspect;

public interface InspectMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Inspect record);

    int insertSelective(Inspect record);

    Inspect selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Inspect record);

    int updateByPrimaryKey(Inspect record);

    List<Inspect> listByAll(Inspect inspect);



}