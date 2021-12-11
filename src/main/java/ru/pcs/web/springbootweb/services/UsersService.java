package ru.pcs.web.springbootweb.services;

import ru.pcs.web.springbootweb.forms.UserForm;
import ru.pcs.web.springbootweb.models.Car;
import ru.pcs.web.springbootweb.models.User;

import java.util.List;

public interface UsersService {
    void addUser(UserForm form);
    List<User> getAllUsers();

    void deleteUser(Integer userId);

    User getUser(Integer userId);

    List<Car> getCarsByUser(Integer userId);

    List<Car> getCarsWithoutOwner();

    void addCarToUser(Integer userId, Integer carId);

    void update(Integer userId, UserForm userForm);
}
