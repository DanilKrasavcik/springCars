package web.services;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {

    private static List<Car> cars;
    {
        cars = new ArrayList<>();

        cars.add(new Car("1","a","x1"));
        cars.add(new Car("2","b","x2"));
        cars.add(new Car("3","c","x3"));
        cars.add(new Car("4","d","x2"));
        cars.add(new Car("5","e","x1"));

    }

    @Override
    public List<Car> carCounter(int c) {
        if ((c <= cars.size()) && (c >= 0)) {
            return cars.stream().limit(c).collect(Collectors.toList());
        } else {
            return cars;
        }
    }
}
