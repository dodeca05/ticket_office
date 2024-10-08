package com.dodeca.quantTicketManager.service;

import com.dodeca.quantTicketManager.database.dto.DomainDTO;
import com.dodeca.quantTicketManager.database.dto.DomainEditDTO;
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

    public List<DomainEntity> getDomainsByTicket(String ticket)
    {
        return  domainRepository.findByTicket(ticket);
    }
    public List<DomainEntity> getDomainsByType(String type)
    {
        return  domainRepository.findByType(type);
    }
    public List<DomainEntity>getDomainsByTypeAndTicket(String ticket,String type)
    {
        return domainRepository.findByTicketAndType(ticket,type);
    }
    public DomainEntity getDomain(String name)
    {
        return domainRepository.findByName(name).get(0);
    }
    public void deleteDomain(String name)
    {
        domainRepository.delete(domainRepository.findByName(name).get(0));
    }
    public DomainEntity editDomain(DomainEditDTO domainEditDTO){
        List<DomainEntity> domainEntityList=domainRepository.findByName(domainEditDTO.getName());
        DomainEntity domainEntity=domainEntityList.get(0);
        domainEntity.setDescription(domainEditDTO.getDescription());
        domainRepository.save(domainEntity);
        return domainEntity;

    }
    public DomainEntity createDomain(DomainDTO domainDTO)
    {
        List<DomainEntity> domainEntityList=domainRepository.findByName(domainDTO.getName());
        if(domainEntityList.size()>0)
            throw new IllegalArgumentException("이미 존재하는 도메인 이름 입니다.");
        DomainEntity domainEntity=domainDTO.toEntity();
        domainRepository.save(domainEntity);
        return domainEntity;
    }
}
