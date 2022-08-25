package org.xunjian.controller.configcenter;

import com.github.pagehelper.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import org.xunjian.mapper.model.Hospital;
import org.xunjian.mapper.model.HospitalList;
import org.xunjian.service.HospitalListService;
import org.xunjian.vo.BaseResponse;


import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/configcenter/hospitalInfo")
@Api(tags = "com.xunjian.configcenter.controller.configcenter.HospitalInfoController", description = "医院相关")

public class HospitalInfoController {
    @Resource
    private HospitalListService HospitalListService;

    @GetMapping("/list")
    @ApiOperation("医院列表")
    public BaseResponse<Page<HospitalList>> list(HospitalList hospital, @ApiParam(required = true) int pageNum, @ApiParam(required = true) int pageSize) {
        Page<HospitalList> hospitals = HospitalListService.listByAll(hospital, pageNum, pageSize);
        return BaseResponse.success(hospitals);
    }

    @GetMapping("/get")
    @ApiOperation("医院详情")
    public BaseResponse<HospitalList> get(Integer id) {
        HospitalList hospital = HospitalListService.selectByPrimaryKey(id);
        return BaseResponse.success(hospital);
    }

    // 没用
    @GetMapping("/listAll")
    @ApiOperation("全部查询医院列表")
    public BaseResponse<List<HospitalList>> listAll(HospitalList hospital) {
        HospitalListService.selectAll(hospital);
        return BaseResponse.success();
    }

    @PostMapping("/update")
    @ApiOperation("更新医院信息")
    public BaseResponse update(@RequestBody HospitalList hospitalInfo) {
        HospitalListService.updateByPrimaryKeySelective(hospitalInfo);
        return BaseResponse.success();
    }
}
