package com.example.flyway.controller;

public class MemberRequest {

    private String name;

    private MemberRequest() {
    }

    public MemberRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
