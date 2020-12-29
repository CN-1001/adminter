package com.jfc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Personcontroller {
    @GetMapping("list")
    public void list() {
        System.out.println("11");
    }
}
