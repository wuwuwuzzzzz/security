package com.wxz.security.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxz.security.config.UserDetailsManagerImpl;
import com.wxz.security.entity.SysUser;
import com.wxz.security.mapper.SysUserMapper;
import com.wxz.security.service.SysUserService;
import jakarta.annotation.Resource;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

/**
 * @author wxz
 * @date 11:20 2024/2/2
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService
{
    @Resource
    private UserDetailsManagerImpl userDetailsManager;

    /**
     * 添加用户
     *
     * @param user user
     * @author wxz
     * @date 14:54 2024/2/2
     */
    @Override
    public void saveUserDetails(SysUser user)
    {
        UserDetails userDetails = User.withDefaultPasswordEncoder()
                                      .username(user.getUserName())
                                      .password(user.getPassword())
                                      .roles("USER")
                                      .build();
        userDetailsManager.createUser(userDetails);
    }
}
