package com.dodeca.quantTicketManager.service;

import com.dodeca.quantTicketManager.database.dto.AddMemberRequestDTO;
import com.dodeca.quantTicketManager.database.entity.Member;
import com.dodeca.quantTicketManager.database.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberService {
    private final MemberRepository memberRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public Long save(AddMemberRequestDTO addMemberRequestDTO){
        return memberRepository.save(Member.builder().id(addMemberRequestDTO.getId())
                .email(addMemberRequestDTO.getEmail())
                .password(bCryptPasswordEncoder.encode(addMemberRequestDTO.getPassword())).build()).getNumber();
    }
}
