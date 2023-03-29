package com.placement.kaiburrfinal2.repository;
import com.placement.kaiburrfinal2.model.Car;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import java.util.Optional;
public interface carrepository extends MongoRepository<Car, String> {
    @Query("{'name': ?0}")
    Optional<Car> findByName(String name);

}