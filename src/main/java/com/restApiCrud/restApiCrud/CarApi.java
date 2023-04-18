package com.restApiCrud.restApiCrud;

import org.omg.PortableInterceptor.RequestInfo;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/api/cars", method=RequestMethod.GET)
public class CarApi {

    private List<Car> Cars;

    public CarApi() {
        Cars = new ArrayList<>();
        Car car1 = new Car(1, "BMW", "e46", LocalDate.ofYearDay(2002, 100));
        Car car2= new Car(2, "BMW", "e38", LocalDate.ofYearDay(1999, 200));
        Car car3 = new Car(3, "BMW", "e34", LocalDate.ofYearDay(1989, 300));
        Cars.add(car1);
        Cars.add(car2);
        Cars.add(car3);
    }

    @GetMapping("/all")
    public List<Car> getCars() {
        return this.Cars;
    }

    public void setCars(List<Car> cars) {
        this.Cars = cars;
    }

    @GetMapping
    public Optional<Car> getCarById(@RequestParam int index) {
        return Cars.stream()
                .filter(car->car.getId() == index)
                .findFirst();
    }

    @PostMapping
    public boolean addCar(@RequestBody Car car) {
        Cars.add(car);
        return Cars.contains(car);
    }

}
