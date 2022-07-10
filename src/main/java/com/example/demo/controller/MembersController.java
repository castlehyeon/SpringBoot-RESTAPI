package com.example.demo.controller;

import com.example.demo.dto.Member;
import com.example.demo.service.MembersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//controller역할을 함을 명시, 데이터를 json으로 처리함을 알리는 RestController어노테이션
public class MembersController {
    @Autowired
    private MembersService service;
    //인터페이스 임포트
    @GetMapping(path = "/test")
    //Get요청을 받아들이고, 이는 /test라는 path를 통해서 작동.
    public List<Member> memberTest() {
        return service.testMember();
        //테스트멤버를 반환하는 메서드
    }
}
