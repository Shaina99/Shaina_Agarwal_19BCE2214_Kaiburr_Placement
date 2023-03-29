package com.placement.kaiburrfinal2.service;
import com.placement.kaiburrfinal2.model.Car;
import com.placement.kaiburrfinal2.repository.carrepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class carservice{
    private final carrepository carRepository;

    public void addCar(Car car) {
        carRepository.insert(car);
    }
    public void saveCar(Car car) {
        carRepository.insert(car);
    }
    public void putCar( Car car) {
        Car savedCar = carRepository.findById(car.getId()).orElseThrow(() -> new RuntimeException(String.format("Cannot Find car by ID %s", car.getId())));
        savedCar.setName(car.getName());
        savedCar.setCarbrand(car.getCarbrand());
        savedCar.setCarPrice(car.getCarPrice());
        carRepository.save(car);


    }
    public Car getCar(String name) {
        Optional<Car> car=this.carRepository.findByName(name);
        if(car.isPresent()) {
            return car.get();
        }
        else {

            throw new RuntimeException(String.format("404 not found"));
        }

    }
    public List<Car> getAllCar(String id){
        if(id==null) {
            List<Car> car=carRepository.findAll();
            return car;
        }
        else{
            return Collections.singletonList(carRepository.findById(id).orElseThrow(() -> new RuntimeException(String.format("404 not found"))));
        }


    }

    public void deleteCar(String id) {
        carRepository.deleteById(id);
    }
}