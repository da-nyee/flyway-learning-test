package com.example.flyway.service;

import com.example.flyway.domain.Member;
import com.example.flyway.domain.MemberRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public void create(MemberRequestDto requestDto) {
        Member member = new Member(requestDto.getName(), requestDto.getCompany());

        memberRepository.save(member);
    }
}
