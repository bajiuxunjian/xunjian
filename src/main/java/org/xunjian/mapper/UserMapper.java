package org.xunjian.mapper;

import org.apache.ibatis.annotations.Param;
import org.xunjian.mapper.model.HospitalList;
import org.xunjian.mapper.model.User;import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> selectByRole(@Param("role") Integer role);

    int updateUsernameById(@Param("updatedUsername") String updatedUsername, @Param("id") Integer id);

    User selectUserByHospitalOwner(String hospitalOwner);


    List<User> selectByUsername(@Param("username")String username);


    List<User> listByAll(User user);


}