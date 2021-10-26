package com.jxd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jxd
 * @date 2021/10/26 21:51
 */
@Controller
@RequestMapping("/test")
public class RequestMappingController {

    @RequestMapping("/testRequestMapping")
    public String testRequestMapping(){
        return "ReqMap";
    }
}
