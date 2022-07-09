package com.example.demo.dto;

public class Member {
    private Integer id;
    private String name;
    private Integer age;
    private String dept;
    //API명세에 따라, 요구되는 데이터 형식을 정의, 이를 객체지향의 '캡슐화'에 의거하여 private 접근지정자
    public Member() { super();
// TODO Auto-generated constructor stub
    }//기본생성자(인가요?)
    public Integer getId() { return id;
    }
    public void setId(Integer id) { this.id = id;
    }
    public String getName() { return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    //private 변수들에 접근하고 값을 변경하기 위한 get, set
    @Override
    public String toString() {
        return "Member [id=" + id + ", name=" + name + ", age=" + age + ", dept=" + dept + "]";
    }// json형식으로 반환.
}
