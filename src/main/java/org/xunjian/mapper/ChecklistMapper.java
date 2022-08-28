package org.xunjian.mapper;

import org.xunjian.mapper.model.Checklist;import java.util.List;

public interface ChecklistMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Checklist record);

    int insertSelective(Checklist record);

    Checklist selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Checklist record);

    int updateByPrimaryKey(Checklist record);

    List<Checklist> listByAll(Checklist checklist);
}