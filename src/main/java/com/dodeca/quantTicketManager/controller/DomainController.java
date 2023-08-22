package com.dodeca.quantTicketManager.controller;

import com.dodeca.quantTicketManager.database.dto.DomainDTO;
import com.dodeca.quantTicketManager.database.dto.DomainEditDTO;
import com.dodeca.quantTicketManager.database.entity.DomainEntity;
import com.dodeca.quantTicketManager.service.DomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
    @PatchMapping("/domain/{domain}")
    public DomainEntity editDomain(@RequestBody DomainEditDTO domainEditDTO)
    {
        return domainService.editDomain(domainEditDTO);
    }

    @GetMapping("/domain/{domain}/ticket")
    public String readDomainTicket(@PathVariable String domain)
    {
        return domainService.getDomain(domain).getTicket();
    }

    @DeleteMapping("/domain/{domain}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeDomain(@PathVariable String domain)
    {
        domainService.deleteDomain(domain);
    }

}
