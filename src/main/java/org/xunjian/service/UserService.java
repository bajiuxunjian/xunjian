package org.xunjian.service;

import io.swagger.models.auth.In;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

import org.springframework.transaction.annotation.Transactional;
import org.xunjian.mapper.UserMapper;
import org.xunjian.mapper.model.User;

import java.util.List;

@Service
public class UserService {

    @Resource
    private UserMapper userMapper;


    public int deleteByPrimaryKey(Integer id) {
        return userMapper.deleteByPrimaryKey(id);
    }


    public int insert(User record) {
        return userMapper.insert(record);
    }


    public int insertSelective(User record) {
        return userMapper.insertSelective(record);
    }


    public User selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }


    public int updateByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKey(record);
    }

    @Transactional(rollbackFor = Exception.class)
    public void updateUser(Integer id, Integer id2, String name) {
        userMapper.updateUsernameById(name, id);
        userMapper.updateUsernameById(name, id2);
    }

    public List<User> selectByUsername(String username) {
        return userMapper.selectByUsername(username);
    }

}

