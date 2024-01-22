package dev.otthon.springclients.web.clients.dtos;

import dev.otthon.springclients.core.models.Client;
import dev.otthon.springclients.core.utils.StringUtils;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClientForm {

    private String name;

    private String email;

    private String phone;

    public Client toClient() {
        return Client.builder()
            .name(name)
            .email(email)
            .phone(StringUtils.cleanPhone(phone))
            .build();
    }

    public static ClientForm of(Client client) {
        return ClientForm.builder()
            .name(client.getName())
            .email(client.getEmail())
            .phone(StringUtils.formatPhone(client.getPhone()))
            .build();
    }
    
}
