package com.dodeca.quantTicketManager.database.repository;

import com.dodeca.quantTicketManager.database.entity.DomainEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DomainRepository extends JpaRepository<DomainEntity,Long> {
    List<DomainEntity> findByName(String name);
}
