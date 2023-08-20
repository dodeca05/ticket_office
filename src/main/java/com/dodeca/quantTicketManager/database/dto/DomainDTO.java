package com.dodeca.quantTicketManager.database.dto;

import com.dodeca.quantTicketManager.database.entity.DomainEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class DomainDTO {

    @Getter
    private String name;
    @Getter
    private String type;
    @Getter
    private String description;

    public DomainEntity toEntity()
    {
        return DomainEntity.builder()
                .name(this.name)
                .type(this.type)
                .description(this.description)
                .ticket("BTS").build();
    }


}
