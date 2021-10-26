package com.jxd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author jxd
 * @date 2021/10/26 20:33
 */
@Controller
public class HelloController {

    // /WEB-INF/templates/index.html
    @RequestMapping( "/")
    public String index(){
        // 返回视图名称
        return "index";
    }

    @RequestMapping("/target")
    public String toTarget(){
        return "target";
    }
}
