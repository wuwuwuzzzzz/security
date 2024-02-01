package com.wxz.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author wxz
 * @date 21:04 2024/2/1
 */
@Controller
public class IndexController
{
    /**
     * @return java.lang.String
     * @author wxz
     * @date 21:04 2024/2/1
     */
    @GetMapping("/")
    public String index()
    {
        return "index";
    }
}
