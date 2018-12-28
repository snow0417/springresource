package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xueyu
 * @date 2018/12/28 17:17
 */
@RestController
public class IndexController {

    @Value("${test}")
    private String test;

    @GetMapping("/")
    public String index(){
        return "";
    }
}
