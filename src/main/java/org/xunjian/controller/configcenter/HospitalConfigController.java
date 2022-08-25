package org.xunjian.controller.configcenter;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xunjian.mapper.model.HospitalConfig;
import org.xunjian.service.HospitalConfigService;
import org.xunjian.vo.BaseResponse;

import com.github.pagehelper.Page;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * @author xiangshuai
 * @date 2022/7/10
 */
@RestController
    @RequestMapping("/configcenter/hospital/config")
@Api(tags = "com.xunjian.configcenter.controller.configcenter.HospitalConfigController", description = "医院配置接口")
public class HospitalConfigController {
    @Resource
    private HospitalConfigService hospitalConfigService;

    @GetMapping("/list")
    @ApiOperation("医院配置列表")
    public BaseResponse<Page<HospitalConfig>> list(HospitalConfig hospitalConfig, @ApiParam(required = true) int pageNum, @ApiParam(required = true) int pageSize) {
        Page<HospitalConfig> hospitalConfigs = hospitalConfigService.listByAll(hospitalConfig, pageNum, pageSize);
        return BaseResponse.success(hospitalConfigs);
    }

    @GetMapping("/get")
    @ApiOperation("医院配置详情")
    public BaseResponse<HospitalConfig> get(Long id) {
        HospitalConfig hospitalConfig = hospitalConfigService.selectByPrimaryKey(id);
        return BaseResponse.success(hospitalConfig);
    }

    @PostMapping("/create")
    @ApiOperation("创建医院配置")
    public BaseResponse create(@RequestBody HospitalConfig hospitalConfig) {
        hospitalConfigService.insert(hospitalConfig);
        return BaseResponse.success();
    }

    @PostMapping("/update")
    @ApiOperation("更新医院配置")
    public BaseResponse update(@RequestBody HospitalConfig hospitalConfig) {
        hospitalConfigService.updateByPrimaryKeySelective(hospitalConfig);
        return BaseResponse.success();
    }

    @PostMapping("/delete")
    @ApiOperation("删除医院配置")
    public BaseResponse delete(@ApiParam(required = true) Long id) {
        hospitalConfigService.deleteByPrimaryKey(id);
        return BaseResponse.success();
    }
}
