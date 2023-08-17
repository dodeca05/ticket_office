package com.dodeca.quantTicketManager.database.repository;

import com.dodeca.quantTicketManager.database.entity.DomainEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DomainRepository extends JpaRepository<DomainEntity,Long> {
}
