package com.example.demo.controller;

import com.example.demo.dto.Member;
import com.example.demo.service.MembersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MembersController {
    @Autowired
    private MembersService service;
    @GetMapping(path = "/test")
    public Member memberTest() {
        return service.testMember();
    }
}
