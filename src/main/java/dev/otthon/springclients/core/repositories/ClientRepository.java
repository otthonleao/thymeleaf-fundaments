package dev.otthon.springclients.core.repositories;

import dev.otthon.springclients.core.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
