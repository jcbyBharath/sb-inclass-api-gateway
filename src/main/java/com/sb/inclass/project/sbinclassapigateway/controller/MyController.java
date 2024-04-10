package com.sb.inclass.project.sbinclassapigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MyController {

    @GetMapping("/secured")
    public String secured() {
        return "Secured";
    }

    @GetMapping("/unsecured")
    public String unsecured() {
        return "un-secured";
    }

}
