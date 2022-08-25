package org.xunjian.controller.configcenter;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xunjian.mapper.model.Config;
import org.xunjian.service.ConfigService;
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
@RequestMapping("/configcenter/config")
@Api(tags = "com.xunjian.configcenter.controller.configcenter.ConfigController", description = "配置接口")
public class ConfigController {
    @Resource
    private ConfigService configService;

    @GetMapping("/list")
    @ApiOperation("配置列表")
    public BaseResponse<Page<Config>> list(Config config, @ApiParam(required = true) int pageNum, @ApiParam(required = true) int pageSize) {
        Page<Config> Configs = configService.listByAll(config, pageNum, pageSize);
        return BaseResponse.success(Configs);
    }

    @GetMapping("/get")
    @ApiOperation("配置详情")
    public BaseResponse<Config> get(Long id) {
        Config Config = configService.selectByPrimaryKey(id);
        return BaseResponse.success(Config);
    }

    @PostMapping("/create")
    @ApiOperation("创建配置")
    public BaseResponse create(@RequestBody Config config) {
        configService.insert(config);
        return BaseResponse.success();
    }

    @PostMapping("/update")
    @ApiOperation("更新配置")
    public BaseResponse update(@RequestBody Config config) {
        configService.updateByPrimaryKeySelective(config);
        return BaseResponse.success();
    }

    @PostMapping("/delete")
    @ApiOperation("删除配置")
    public BaseResponse delete(@ApiParam(required = true) Long id) {
        configService.deleteByPrimaryKey(id);
        return BaseResponse.success();
    }
}
