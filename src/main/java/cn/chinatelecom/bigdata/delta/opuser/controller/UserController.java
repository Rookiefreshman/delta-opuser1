package cn.chinatelecom.bigdata.delta.opuser.controller;

import cn.chinatelecom.bigdata.delta.common.service.dto.RestResult;
import cn.chinatelecom.bigdata.delta.opuser.dto.request.UserLoginBody;
import cn.chinatelecom.bigdata.delta.opuser.dto.response.UserVo;
import cn.chinatelecom.bigdata.delta.opuser.service.UserLoginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 石祥
 * @date 2020/4/28
 */
@Api(tags = "用户登录")
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserLoginService userLoginService;

    @ApiOperation("用户登录操作")
    @GetMapping("/login")
    public RestResult<UserVo> userlogin(@RequestBody UserLoginBody userLoginBody){

        return RestResult.<UserVo>builder().ok(userLoginService.getUserInfo(userLoginBody));

    }
}
