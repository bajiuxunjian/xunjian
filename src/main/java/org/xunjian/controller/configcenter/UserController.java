package org.xunjian.controller.configcenter;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xunjian.mapper.model.Inspect;
import org.xunjian.mapper.model.User;
import org.xunjian.service.UserService;
import org.xunjian.vo.BaseResponse;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

import static org.xunjian.vo.BaseResponse.BaseResponseCodeEnum.USER_OR_PASSWORD_ERROR;

@CrossOrigin
@RestController
@RequestMapping("/configcenter/user")
@Api(tags = "com.xunjian.configcenter.controller.configcenter.user", description = "用户接口")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/login")
    @ApiOperation("登录")
    public BaseResponse login(@ApiParam(required = true) String username, @ApiParam(required = true) String password) {
        List<User> users = userService.selectByUsername(username);
        if(users.size() == 0) {
            return  BaseResponse.error(USER_OR_PASSWORD_ERROR);
        }else if(Objects.equals(users.get(0).getPassword(), password)) {
            return BaseResponse.success(users.get(0));
        } else {
            return  BaseResponse.error(USER_OR_PASSWORD_ERROR);
        }
    }

    @GetMapping("/get")
    @ApiOperation("获取详情")
    public BaseResponse<User> get(Integer id) {
        User user = userService.selectByPrimaryKey(id);
        return BaseResponse.success(user);
    }



}
