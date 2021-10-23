package com.example.flyway.controller;

import com.example.flyway.service.MemberRequestDto;
import com.example.flyway.service.MemberService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MemberController {

    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping("/members")
    public ResponseEntity<Void> create(@RequestBody MemberRequest request) {
        memberService.create(new MemberRequestDto(request.getName(), request.getCompany()));

        return ResponseEntity.ok().build();
    }
}
