package com.example.demo.controller;

import com.example.demo.dto.Member;
import org.springframework.web.bind.annotation.GetMapping;

public class MembersController {
    @GetMapping(path = "/test")
    public Member memberTest() {
        Member testMember = new Member();
        testMember.setId(1);
        testMember.setName("testName");
        testMember.setAge(15);
        testMember.setDept("test");
        return testMember;
    }
}
