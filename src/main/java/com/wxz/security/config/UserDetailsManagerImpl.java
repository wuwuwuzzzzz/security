package com.wxz.security.config;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wxz.security.entity.SysUser;
import com.wxz.security.mapper.SysUserMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsPasswordService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * @author wxz
 * @date 14:14 2024/2/2
 */
@Component
public class UserDetailsManagerImpl implements UserDetailsManager, UserDetailsPasswordService
{
    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public UserDetails updatePassword(UserDetails user, String newPassword)
    {
        return null;
    }

    /**
     * 添加用户
     *
     * @param user user
     * @author wxz
     * @date 15:01 2024/2/2
     */
    @Override
    public void createUser(UserDetails user)
    {
        SysUser sysUser = new SysUser();
        BeanUtils.copyProperties(user, sysUser);
        sysUserMapper.insert(sysUser);
    }

    @Override
    public void updateUser(UserDetails user)
    {

    }

    @Override
    public void deleteUser(String username)
    {

    }

    @Override
    public void changePassword(String oldPassword, String newPassword)
    {

    }

    @Override
    public boolean userExists(String username)
    {
        return false;
    }

    /**
     * 从数据库中获取用户信息
     *
     * @param username username
     * @return org.springframework.security.core.userdetails.UserDetails
     * @author wxz
     * @date 15:00 2024/2/2
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
    {
        QueryWrapper<SysUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_name", username);
        SysUser user = sysUserMapper.selectOne(queryWrapper);

        if (user == null)
        {
            throw new UsernameNotFoundException("用户不存在");
        }
        else
        {
            return new User(user.getUserName(), user.getPassword(), true, true,
                    true, true, new ArrayList<>());
        }
    }
}
