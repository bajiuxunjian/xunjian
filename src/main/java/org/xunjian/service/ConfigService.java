package org.xunjian.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.xunjian.mapper.ConfigMapper;
import org.xunjian.model.Config;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

/**
 * @author xiangshuai
 * @date 2022/7/10
 */
@Service
public class ConfigService{

    @Resource
    private ConfigMapper configMapper;


    public int deleteByPrimaryKey(Long id) {
        return configMapper.deleteByPrimaryKey(id);
    }


    public int insert(Config record) {
        return configMapper.insert(record);
    }


    public int insertSelective(Config record) {
        return configMapper.insertSelective(record);
    }


    public Config selectByPrimaryKey(Long id) {
        return configMapper.selectByPrimaryKey(id);
    }


    public int updateByPrimaryKeySelective(Config record) {
        return configMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Config record) {
        return configMapper.updateByPrimaryKey(record);
    }

    public Page<Config> listByAll(Config config, int pageNum, int pageSize) {
        Page<Config> pageRes = PageHelper.startPage(pageNum, pageSize);
        configMapper.listByAll(config);
        return pageRes;
    }
}
