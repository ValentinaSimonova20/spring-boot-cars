package ru.pcs.web.springbootweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.pcs.web.springbootweb.models.User;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);
}
