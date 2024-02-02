package com.wxz.security.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxz.security.entity.SysUser;
import com.wxz.security.mapper.SysUserMapper;
import org.springframework.stereotype.Service;
import com.wxz.security.service.SysUserService;

/**
 * @author wxz
 * @date 11:20 2024/2/2
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService
{
}
