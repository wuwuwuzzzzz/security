package com.wxz.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author wxz
 * @date 09:56 2024/2/2
 */
@Configuration
public class WebSecurityConfig
{
//    /**
//     * @return org.springframework.security.core.userdetails.UserDetailsService
//     * @author wxz
//     * @date 09:58 2024/2/2
//     */
//    @Bean
//    public UserDetailsService userDetailsService()
//    {
//        // 创建基于内存的用户信息管理器
//        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
//        // 创建 UserDetails 对象，用于管理用户名、用户密码、用户角色、用户权限等内容
//        manager.createUser(User.withDefaultPasswordEncoder()
//                               .username("user")
//                               .password("password")
//                               .roles("USER")
//                               .build());
//        return manager;
//    }

//    /**
//     * @return org.springframework.security.core.userdetails.UserDetailsService
//     * @author wxz
//     * @date 14:22 2024/2/2
//     */
//    @Bean
//    public UserDetailsService userDetailsService()
//    {
//        return new UserDetailsManagerImpl();
//    }

    /**
     * 使用 BCrypt 加密方式
     *
     * @return org.springframework.security.crypto.password.PasswordEncoder
     * @author wxz
     * @date 14:33 2024/2/2
     */
    @Bean
    public PasswordEncoder passwordEncoder()
    {
        return new BCryptPasswordEncoder();
    }
}
