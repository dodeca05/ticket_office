package com.dodeca.quantTicketManager.database.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.antlr.v4.runtime.misc.NotNull;

@AllArgsConstructor
@Getter
public class DomainEditDTO {
    @NotNull
    String name;
    String description;

}
