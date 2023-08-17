package com.dodeca.quantTicketManager.service;

import com.dodeca.quantTicketManager.database.entity.DomainEntity;
import com.dodeca.quantTicketManager.database.repository.DomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DomainService {
    @Autowired
    DomainRepository domainRepository;

    public List<DomainEntity> getAllDomain()
    {
        return domainRepository.findAll();
    }
}
