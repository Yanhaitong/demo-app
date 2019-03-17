package com.yht.demo.controller.user;

import com.yht.demo.common.BaseController;
import com.yht.demo.common.Result;
import com.yht.demo.entity.dto.user.UserReceiveDTO;
import com.yht.demo.service.user.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Api("用户管理")
@RestController
@RequestMapping("/user")
public class UserController extends BaseController {

    @Autowired
    private IUserService userService;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @PostMapping("/sendVerifyCode")
    @ApiOperation(value = "发送验证码")
    public Result sendVerificationCode(@RequestParam String mobileNo, @RequestParam String clientName) {
        if (StringUtils.isEmpty(mobileNo) || StringUtils.isEmpty(clientName)) {
            return Result.error(500, "发送失败，参数错误！");
        }
        //userService.sendVerificationCode(mobileNo, clientName);
        return Result.success("发送成功！");
    }

    @PostMapping("/loginOrRegister")
    @ApiOperation(value = "验证码登录或注册")
    public Result loginOrRegister(@ModelAttribute UserReceiveDTO userReceiveDTO) {
        if (StringUtils.isEmpty(userReceiveDTO.getMobileNo()) || StringUtils.isEmpty(userReceiveDTO.getCode())) {
            return Result.error(500, "发送失败，参数错误！");
        }

        //获取验证码
        //String localCode = stringRedisTemplate.opsForValue().get("SMS" + userDto.getMobileNo());
        //if (StringUtils.isEmpty(localCode) || !localCode.equals(userDto.getCode())) {
            //return Result.error(500, "验证码错误！");
        //}

        String token = userService.verifyCodeLoginOrRegister(userReceiveDTO);
        Map<String, Object> map = new HashMap<>();
        map.put("token", token);
        return Result.success(map);
    }

    @PostMapping("/loginOut")
    @ApiOperation(value = "退出登录")
    public Result loginOut(@RequestParam String token) {
        if (StringUtils.isEmpty(token)) {
            return Result.error(500, "发送失败，参数错误！");
        }
        userService.loginOut(token);
        return Result.success("退出成功！");
    }



}
