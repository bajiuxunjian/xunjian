package org.xunjian.mapper;

import org.xunjian.mapper.model.Report;

/**
 * @author xiangshuai
 * @date 2022/7/10
 */
public interface ReportMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Report record);

    int insertSelective(Report record);

    Report selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Report record);

    int updateByPrimaryKey(Report record);
}