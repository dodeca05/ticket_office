package com.dodeca.quantTicketManager.controller;

import com.dodeca.quantTicketManager.database.dto.AddMemberRequestDTO;
import com.dodeca.quantTicketManager.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@RequiredArgsConstructor
@Controller

public class MemberApiController {
    private final MemberService memberService;
    @PostMapping("/user")
    public String singup(AddMemberRequestDTO requestDTO){
        memberService.save(requestDTO);
        return"DONE";
    }
}
