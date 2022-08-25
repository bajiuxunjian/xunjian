package org.xunjian.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.xunjian.mapper.model.Config;

/**
 * @author xiangshuai
 * @date 2022/7/10
 */
public interface ConfigMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Config record);

    int insertSelective(Config record);

    Config selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Config record);

    int updateByPrimaryKey(Config record);

    List<Config> listByAll(Config config);




}
