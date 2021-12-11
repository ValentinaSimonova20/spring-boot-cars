package ru.pcs.web.springbootweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.pcs.web.springbootweb.models.Car;

import java.util.List;

public interface CarsRepository extends JpaRepository<Car, Integer> {
        List<Car> findAllByOwnerId(Integer id);

        List<Car> findAllByOwnerIsNull();
}
