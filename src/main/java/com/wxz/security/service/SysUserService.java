package com.wxz.security.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wxz.security.entity.SysUser;

/**
 * @author wxz
 * @date 11:27 2024/2/2
 */
public interface SysUserService extends IService<SysUser>
{
    /**
     * 添加用户
     *
     * @param user user
     * @author wxz
     * @date 14:54 2024/2/2
     */
    void saveUserDetails(SysUser user);
}
