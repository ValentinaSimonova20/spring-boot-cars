package ru.pcs.web.springbootweb.services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.pcs.web.springbootweb.forms.UserForm;
import ru.pcs.web.springbootweb.models.Car;
import ru.pcs.web.springbootweb.models.User;
import ru.pcs.web.springbootweb.repositories.CarsRepository;
import ru.pcs.web.springbootweb.repositories.UsersRepository;

import java.util.List;

@RequiredArgsConstructor
@Component
public class UsersServiceImpl implements UsersService {

    private final UsersRepository usersRepository;

    private final CarsRepository carsRepository;

    @Override
    public void addUser(UserForm form) {
        User user = User.builder()
                .firstName(form.getFirstName())
                .lastName(form.getLastName())
                .build();

        usersRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return usersRepository.findAll();
    }

    @Override
    public void deleteUser(Integer userId) {
        usersRepository.deleteById(userId);
    }

    @Override
    public User getUser(Integer userId) {
        return usersRepository.getById(userId);
    }

    @Override
    public List<Car> getCarsByUser(Integer userId) {
        return carsRepository.findAllByOwnerId(userId);
    }

    @Override
    public List<Car> getCarsWithoutOwner() {
        return carsRepository.findAllByOwnerIsNull();
    }

    @Override
    public void addCarToUser(Integer userId, Integer carId) {
        User user = usersRepository.getById(userId);
        Car car = carsRepository.getById(carId);
        car.setOwner(user);
        carsRepository.save(car);
    }

    @Override
    public void update(Integer userId, UserForm userForm) {
        User user = usersRepository.getById(userId);
        user.setFirstName(userForm.getFirstName());
        user.setLastName(userForm.getLastName());
        usersRepository.save(user);
    }
}
