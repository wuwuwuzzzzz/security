package com.wxz.security.controller;

import com.wxz.security.entity.SysUser;
import com.wxz.security.service.SysUserService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author wxz
 * @date 11:28 2024/2/2
 */
@RestController
@RequestMapping
public class SysUserController
{
    @Resource
    private SysUserService sysUserService;

    /**
     * @return java.util.List<com.wxz.security.entity.SysUser>
     * @author wxz
     * @date 11:28 2024/2/2
     */
    @GetMapping("/list")
    public List<SysUser> getList()
    {
        return sysUserService.list();
    }

    /**
     * 添加用户
     *
     * @param user user
     * @author wxz
     * @date 14:53 2024/2/2
     */
    @PostMapping("/add")
    public void add(@RequestBody SysUser user)
    {
        sysUserService.saveUserDetails(user);
    }
}
