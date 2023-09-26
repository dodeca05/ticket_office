package com.dodeca.quantTicketManager.database.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddMemberRequestDTO {
    private String id;
    private String email;
    private String password;
}
