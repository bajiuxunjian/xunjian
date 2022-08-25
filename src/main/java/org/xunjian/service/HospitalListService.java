package org.xunjian.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

import org.xunjian.mapper.model.Hospital;
import org.xunjian.mapper.model.HospitalList;
import org.xunjian.mapper.HospitalListMapper;

import java.util.List;

@Service
public class HospitalListService{

    @Resource
    private HospitalListMapper hospitalListMapper;

    
    public int deleteByPrimaryKey(Integer id) {
        return hospitalListMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(HospitalList record) {
        return hospitalListMapper.insert(record);
    }

    
    public int insertSelective(HospitalList record) {
        return hospitalListMapper.insertSelective(record);
    }

    
    public HospitalList selectByPrimaryKey(Integer id) {
        return hospitalListMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(HospitalList record) {
        return hospitalListMapper.updateByPrimaryKeySelective(record);
    }

    public Page<HospitalList> listByAll(HospitalList hospitallist, int pageNum, int pageSize) {
        Page<HospitalList> pageRes = PageHelper.startPage(pageNum, pageSize);
        hospitalListMapper.listByAll(hospitallist);
        return pageRes;
    }
    
    public int updateByPrimaryKey(HospitalList record) {
        return hospitalListMapper.updateByPrimaryKey(record);
    }

    public List<HospitalList> selectAll(HospitalList record) {
        return hospitalListMapper.listByAll(record);
    }



}
