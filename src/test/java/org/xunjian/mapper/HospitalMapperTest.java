package org.xunjian.mapper;

import static org.junit.jupiter.api.Assertions.*;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.xunjian.TestBase;
import org.xunjian.model.Hospital;

/**
 * @author xiangshuai
 * @date 2022/7/10
 */
class HospitalMapperTest extends TestBase {
    @Resource
    private HospitalMapper hospitalMapper;

    @Test
    void deleteByPrimaryKey() {
    }

    @Test
    void insert() {
    }

    @Test
    void insertSelective() {
    }

    @Test
    void selectByPrimaryKey() {
        Hospital hospital = hospitalMapper.selectByPrimaryKey(1L);
        assertEquals("北京市第一医院", hospital.getName());
    }

    @Test
    void updateByPrimaryKeySelective() {
    }

    @Test
    void updateByPrimaryKey() {
    }
}
