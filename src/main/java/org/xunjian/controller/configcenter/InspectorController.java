package org.xunjian.controller.configcenter;


import com.github.pagehelper.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;
import org.xunjian.mapper.model.Hospital;
import org.xunjian.mapper.model.Inspect;
import org.xunjian.service.InspectService;
import org.xunjian.vo.BaseResponse;

import javax.annotation.Resource;
import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("/configcenter/inspector")
@Api(tags = "com.xunjian.configcenter.controller.configcenter.InspectorController", description = "检测接口")
public class InspectorController {

    @Resource
    private InspectService inspectService;

    @GetMapping("/list")
    @ApiOperation("检测项列表")
    public BaseResponse<List<Inspect>> list(Inspect inspect) {
        List<Inspect> inspects = inspectService.listByAll(inspect);
        return BaseResponse.success(inspects);
    }

    @GetMapping("/del")
    @ApiOperation("检测项列表")
    public BaseResponse del(Integer id) {
        inspectService.deleteByPrimaryKey(id);
        return BaseResponse.success();
    }

    @GetMapping("/get")
    @ApiOperation("检测项详情")
    public BaseResponse<Inspect> get(Integer id) {
        Inspect inspect = inspectService.selectByPrimaryKey(id);
        return BaseResponse.success(inspect);
    }

    @PostMapping("/create")
    @ApiOperation("创建检测项详情")
    public BaseResponse create(@RequestBody Inspect inspect) {
        inspectService.insert(inspect);
        return BaseResponse.success();
    }

    @PostMapping("/update")
    @ApiOperation("更新检测项详情")
    public BaseResponse update(@RequestBody Inspect inspect) {
        inspectService.updateByPrimaryKeySelective(inspect);;
        return BaseResponse.success();
    }



}
