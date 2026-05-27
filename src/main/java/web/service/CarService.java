package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {

    ArrayList<Car> cars = new ArrayList<>(List.of(
            new Car("Mercedes", 2, "Black"),
            new Car("BMV", 8, "Red"),
            new Car("Toyota", 22, "White"),
            new Car("Zaporozhec", 1, "Brown"),
            new Car("Volga", 5, "Blue")
    ));

    public List<Car> getCars(Integer count) {
        int size = (count == null) ? cars.size() : count;
        if (size >= cars.size()) {
            return cars;
        } else {
            return cars.stream()
                    .limit(count)
                    .collect(Collectors.toList());
        }
    }
}
