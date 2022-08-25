package org.xunjian.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.xunjian.mapper.HospitalConfigMapper;
import org.xunjian.mapper.model.HospitalConfig;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

/**
 * @author xiangshuai
 * @date 2022/7/10
 */
@Service
public class HospitalConfigService{

    @Resource
    private HospitalConfigMapper hospitalConfigMapper;


    public int deleteByPrimaryKey(Long id) {
        return hospitalConfigMapper.deleteByPrimaryKey(id);
    }


    public int insert(HospitalConfig record) {
        return hospitalConfigMapper.insert(record);
    }


    public int insertSelective(HospitalConfig record) {
        return hospitalConfigMapper.insertSelective(record);
    }


    public HospitalConfig selectByPrimaryKey(Long id) {
        return hospitalConfigMapper.selectByPrimaryKey(id);
    }


    public int updateByPrimaryKeySelective(HospitalConfig record) {
        return hospitalConfigMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(HospitalConfig record) {
        return hospitalConfigMapper.updateByPrimaryKey(record);
    }

    public Page<HospitalConfig> listByAll(HospitalConfig hospitalConfig, int pageNum, int pageSize) {
        Page<HospitalConfig> pageRes = PageHelper.startPage(pageNum, pageSize);
        hospitalConfigMapper.listByAll(hospitalConfig);
        return pageRes;
    }
}
