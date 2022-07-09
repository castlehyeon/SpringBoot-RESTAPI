package com.example.demo.service.impl;

import com.example.demo.dto.Member;
import com.example.demo.service.MembersService;
import org.springframework.stereotype.Service;

@Service
public class MembersServiceImpl implements MembersService {
    //구현부를 작성
    @Override
    public Member testMember() {
        //컨트롤러에서 작성했던 로직을 가지고 옴.

        Member testMember = new Member();
        testMember.setId(1);
        testMember.setName("testName");
        testMember.setAge(15);
        testMember.setDept("서비스로 이동함!");
        //로직을 가져왔음을 표시해둠.
        return testMember;
    }
}