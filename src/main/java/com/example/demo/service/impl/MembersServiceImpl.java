package com.example.demo.service.impl;

import com.example.demo.dao.MembersDAO;
import com.example.demo.dto.Member;
import com.example.demo.service.MembersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembersServiceImpl implements MembersService {
    //구현부를 작성
    @Autowired
    private MembersDAO dao;
    // DAO를 생성하고 호출만 하도록 수정
    @Override
    public List<Member> testMember() {

        return dao.testMember();
    }
}