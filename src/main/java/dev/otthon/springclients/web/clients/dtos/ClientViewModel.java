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
public class ClientViewModel {

    private Long id;

    private String name;

    private String phone;

    private String email;

    public String getPhone() {
        return StringUtils.formatPhone(phone);
    }

    public static ClientViewModel of(Client client) {
        return ClientViewModel.builder()
            .id(client.getId())
            .name(client.getName())
            .email(client.getEmail())
            .phone(client.getPhone())
            .build();
    }
    
}
