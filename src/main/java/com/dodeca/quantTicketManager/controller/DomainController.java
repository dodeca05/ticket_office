package com.dodeca.quantTicketManager.controller;

import com.dodeca.quantTicketManager.database.dto.DomainDTO;
import com.dodeca.quantTicketManager.database.entity.DomainEntity;
import com.dodeca.quantTicketManager.service.DomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DomainController {
    @Autowired
    DomainService domainService;
    @PostMapping("/domain")
    public DomainEntity createDomain(@RequestBody DomainDTO domainDTO)
    {
        return domainService.createDomain(domainDTO);
    }
    @GetMapping("/domain")
    public List<DomainEntity> readAllDomain()
    {
        return domainService.getAllDomain();
    }

    @GetMapping("/domain/{domain}")
    public DomainEntity readDomain(@PathVariable String domain)
    {
        return domainService.getDomain(domain);
    }

    @GetMapping("/domain/{domain}/ticket")
    public String readDomainTicket(@PathVariable String domain)
    {
        return domainService.getDomain(domain).getTicket();
    }

    @DeleteMapping("/domain/{domain}")
    public String removeDomain(@PathVariable String domain)
    {
        return domain;
    }

}
