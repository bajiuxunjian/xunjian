package org.xunjian.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.xunjian.mapper.model.Checklist;
import org.xunjian.mapper.ChecklistMapper;

@Service
public class ChecklistService {

    @Resource
    private ChecklistMapper checklistMapper;


    public int deleteByPrimaryKey(Integer id) {
        return checklistMapper.deleteByPrimaryKey(id);
    }


    public int insert(Checklist record) {
        return checklistMapper.insert(record);
    }


    public int insertSelective(Checklist record) {
        return checklistMapper.insertSelective(record);
    }


    public Checklist selectByPrimaryKey(Integer id) {
        return checklistMapper.selectByPrimaryKey(id);
    }


    public int updateByPrimaryKeySelective(Checklist record) {
        return checklistMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Checklist record) {
        return checklistMapper.updateByPrimaryKey(record);
    }

    public Page<Checklist> listByAll(Checklist checklist, int pageNum, int pageSize) {
        Page<Checklist> pageRes = PageHelper.startPage(pageNum, pageSize);
        checklistMapper.listByAll(checklist);
        return pageRes;
    }
}






