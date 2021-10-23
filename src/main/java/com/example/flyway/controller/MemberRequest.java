package com.example.flyway.controller;

public class MemberRequest {

    private String name;
    private String company;

    private MemberRequest() {
    }

    public MemberRequest(String name, String company) {
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
