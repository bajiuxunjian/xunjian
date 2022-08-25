package org.xunjian.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.xunjian.mapper.HospitalMapper;
import org.xunjian.mapper.model.Hospital;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

/**
 * @author xiangshuai
 * @date 2022/7/10
 */
@Service
public class HospitalService {

    @Resource
    private HospitalMapper hospitalMapper;

    public int deleteByPrimaryKey(Long id) {
        return hospitalMapper.deleteByPrimaryKey(id);
    }

    public int insert(Hospital record) {
        return hospitalMapper.insert(record);
    }

    public int insertSelective(Hospital record) {
        return hospitalMapper.insertSelective(record);
    }

    public Hospital selectByPrimaryKey(Long id) {
        return hospitalMapper.selectByPrimaryKey(id);
    }


    public Page<Hospital> listByAll(Hospital hospital, int pageNum, int pageSize) {
        Page<Hospital> pageRes = PageHelper.startPage(pageNum, pageSize);
        hospitalMapper.listByAll(hospital);
        return pageRes;
    }

    public int updateByPrimaryKeySelective(Hospital record) {
        return hospitalMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Hospital record) {
        return hospitalMapper.updateByPrimaryKey(record);
    }

}
