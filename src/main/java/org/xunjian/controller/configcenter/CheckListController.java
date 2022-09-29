package org.xunjian.controller.configcenter;


import com.github.pagehelper.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;
import org.xunjian.mapper.model.Checklist;
import org.xunjian.service.ChecklistService;
import org.xunjian.vo.BaseResponse;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/configcenter/checkList")
@Api(tags = "com.xunjian.configcenter.controller.configcenter.CheckListController", description = "检测表单")
public class CheckListController {

    @Resource
    private ChecklistService checklistService;

    @GetMapping("/listAll")
    @ApiOperation("查询全部")
    public BaseResponse<Page<Checklist>> list(Checklist checklist, @ApiParam(required = true) int pageNum, @ApiParam(required = true) int pageSize) {
        Page<Checklist> checklists = checklistService.listByAll(checklist, pageNum, pageSize);
        return BaseResponse.success(checklists);
    }

    @GetMapping("/get")
    @ApiOperation("查询当前表单信息")
    public BaseResponse<Checklist> get(Integer id) {
        Checklist checklist = checklistService.selectByPrimaryKey(id);
        return BaseResponse.success(checklist);
    }


    @PostMapping("/debugCreate")
    @ApiOperation("创建医院")
    public BaseResponse testCreate(@RequestBody Checklist checklist) {
        checklistService.insert(checklist);
        return BaseResponse.success();
    }


    @PostMapping("/update")
    @ApiOperation("更新数据")
    public BaseResponse update(@RequestBody Checklist checklist) {
        checklistService.updateByPrimaryKeySelective(checklist);
        return BaseResponse.success();
    }

    @PostMapping("/create")
    @ApiOperation("创建新单子")
    public BaseResponse createList(@RequestBody Checklist checklist) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        checklist.setName(dateFormat.format(date));
        checklistService.insert(checklist);
        return BaseResponse.success();
    }








}
