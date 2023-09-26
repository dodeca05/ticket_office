package com.dodeca.quantTicketManager.controller;

import com.dodeca.quantTicketManager.database.dto.AddMemberRequestDTO;
import com.dodeca.quantTicketManager.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RequiredArgsConstructor
@Controller

public class MemberApiController {
    private final MemberService memberService;
    @PostMapping("/user")
    public String singup(@RequestBody AddMemberRequestDTO requestDTO){
        memberService.save(requestDTO);
        return"DONE";
    }
}
