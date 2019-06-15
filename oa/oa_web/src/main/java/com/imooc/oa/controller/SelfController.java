package com.imooc.oa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Hucq
 * @title
 * @Package com.imooc.oa.controller
 * @date 2019/5/30 9:55
 */
@Controller("selfController")
public class SelfController {

    @RequestMapping("/fudan")
    public String toLogin(){
        return "login";
    }


}
