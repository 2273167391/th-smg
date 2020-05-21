package com.tenghu.smg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Desctiption
 * @Author sie_libiao
 * @Date 2020/5/21 18:06
 * @Version 1.0
 */
@Controller
public class IndexController {
    @GetMapping(path = "/")
    public String index(){
        return "/index";
    }
}
