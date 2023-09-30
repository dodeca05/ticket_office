package com.dodeca.quantTicketManager.controller;

import com.dodeca.quantTicketManager.database.entity.DomainEntity;
import com.dodeca.quantTicketManager.service.DomainService;
import jakarta.websocket.server.PathParam;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class WebController {
    private final DomainService domainService;

    @GetMapping("/web/main")
    public String getDomainListWeb(Model model)
    {
        List<DomainEntity> domains=domainService.getAllDomain();
        model.addAttribute("domains",domains);
        return "domains";
    }
    @GetMapping("/web/domain/{domain}")
    public String getSpecificDomainWeb(@PathVariable String domain, Model model)
    {
        DomainEntity domainEntity=domainService.getDomain(domain);
        model.addAttribute("domain",domainEntity);
        return "domain";
    }
    @GetMapping("/web/create")
    public String createDomain() {
        return "create";
    }
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/signup")
    public String signup(){return "signup";}
    @GetMapping("/")
    public String mainPage(){return "redirect:/web/main";}
}
