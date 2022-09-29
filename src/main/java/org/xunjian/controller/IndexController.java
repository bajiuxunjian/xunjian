package org.xunjian.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xunjian.vo.BaseResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author xiangshuai
 * @date 2022/7/10
 */
@CrossOrigin
@RestController
@RequestMapping
@Api(tags = "com.xunjian.configcenter.controller.IndexController", description = "首页接口")
public class IndexController {
    @GetMapping("/health")
    @ApiOperation("健康检查")
    public BaseResponse<String> health() {
        return BaseResponse.success("ok");
    }

}
