package com.lic.demo.controller;

import net.bytebuddy.asm.Advice;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @Author: lic
 * @data: 2019/9/24
 */
@RestController
@RequestMapping("mytest")
public class MyTestController {

    @RequestMapping("t01")
    public String t01() {
        return "123";
    }

    @RequestMapping("t02")
    public String t02(@RequestBody Map map) {
        return "321";
    }
}
