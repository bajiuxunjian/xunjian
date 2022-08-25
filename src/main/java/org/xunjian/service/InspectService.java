package org.xunjian.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.xunjian.mapper.InspectMapper;
import org.xunjian.mapper.model.Inspect;

import java.util.List;

@Service
public class InspectService{

    @Resource
    private InspectMapper inspectMapper;

    
    public int deleteByPrimaryKey(Integer id) {
        return inspectMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(Inspect record) {
        return inspectMapper.insert(record);
    }

    
    public int insertSelective(Inspect record) {
        return inspectMapper.insertSelective(record);
    }

    
    public Inspect selectByPrimaryKey(Integer id) {
        return inspectMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(Inspect record) {
        return inspectMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(Inspect record) {
        return inspectMapper.updateByPrimaryKey(record);
    }


    public List<Inspect> listByAll(Inspect record) {
        return  inspectMapper.listByAll(record);
    }


}
