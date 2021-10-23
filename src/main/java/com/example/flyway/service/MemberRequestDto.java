package com.example.flyway.service;

public class MemberRequestDto {

    private String name;
    private String company;

    private MemberRequestDto() {
    }

    public MemberRequestDto(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }
}
