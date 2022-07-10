package org.xunjian.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.xunjian.mapper.ReportMapper;
import org.xunjian.model.Report;
/**
 * @author xiangshuai
 * @date 2022/7/10
 */
@Service
public class ReportService{

    @Resource
    private ReportMapper reportMapper;

    
    public int deleteByPrimaryKey(Long id) {
        return reportMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(Report record) {
        return reportMapper.insert(record);
    }

    
    public int insertSelective(Report record) {
        return reportMapper.insertSelective(record);
    }

    
    public Report selectByPrimaryKey(Long id) {
        return reportMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(Report record) {
        return reportMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(Report record) {
        return reportMapper.updateByPrimaryKey(record);
    }

}
