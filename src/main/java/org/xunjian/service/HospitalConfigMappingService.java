package org.xunjian.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.xunjian.mapper.HospitalConfigMappingMapper;
import org.xunjian.mapper.model.HospitalConfigMapping;
/**
 * @author xiangshuai
 * @date 2022/7/10
 */
@Service
public class HospitalConfigMappingService{

    @Resource
    private HospitalConfigMappingMapper hospitalConfigMappingMapper;

    
    public int deleteByPrimaryKey(Long id) {
        return hospitalConfigMappingMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(HospitalConfigMapping record) {
        return hospitalConfigMappingMapper.insert(record);
    }

    
    public int insertSelective(HospitalConfigMapping record) {
        return hospitalConfigMappingMapper.insertSelective(record);
    }

    
    public HospitalConfigMapping selectByPrimaryKey(Long id) {
        return hospitalConfigMappingMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(HospitalConfigMapping record) {
        return hospitalConfigMappingMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(HospitalConfigMapping record) {
        return hospitalConfigMappingMapper.updateByPrimaryKey(record);
    }

}
