package org.xunjian.controller.configcenter;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xunjian.model.Hospital;
import org.xunjian.service.HospitalService;
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
@RequestMapping("/configcenter/hospital")
@Api(tags = "com.xunjian.configcenter.controller.configcenter.HospitalController", description = "医院接口")
public class HospitalController {
    @Resource
    private HospitalService hospitalService;

    @GetMapping("/list")
    @ApiOperation("医院列表")
    public BaseResponse<Page<Hospital>> list(Hospital hospital, @ApiParam(required = true) int pageNum, @ApiParam(required = true) int pageSize) {
        Page<Hospital> hospitals = hospitalService.listByAll(hospital, 1, 10);
        return BaseResponse.success(hospitals);
    }

    @GetMapping("/get")
    @ApiOperation("医院详情")
    public BaseResponse<Hospital> get(Long id) {
        Hospital hospital = hospitalService.selectByPrimaryKey(id);
        return BaseResponse.success(hospital);
    }

    @PostMapping("/create")
    @ApiOperation("创建医院")
    public BaseResponse create(@RequestBody Hospital hospital) {
        hospitalService.insert(hospital);
        return BaseResponse.success();
    }

    @PostMapping("/update")
    @ApiOperation("更新医院")
    public BaseResponse update(@RequestBody Hospital hospital) {
        hospitalService.updateByPrimaryKeySelective(hospital);
        return BaseResponse.success();
    }
    @PostMapping("/delete")
    @ApiOperation("删除医院")
    public BaseResponse delete(@ApiParam(required = true) Long id) {
        hospitalService.deleteByPrimaryKey(id);
        return BaseResponse.success();
    }
}
