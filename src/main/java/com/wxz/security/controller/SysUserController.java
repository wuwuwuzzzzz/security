package com.wxz.security.controller;

import com.wxz.security.entity.SysUser;
import com.wxz.security.service.SysUserService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
