package ru.pcs.web.springbootweb.repositories.jdbc;

import ru.pcs.web.springbootweb.models.User;

import java.util.List;

/**
 * Источник информации
 */
public interface UsersRepository {
    List<User> findAll();
    void save(User user);

    void delete(Long userId);

    User findById(Long userId);
}
