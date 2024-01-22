package dev.otthon.thymeleaf.core.repositories;

import dev.otthon.thymeleaf.core.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
