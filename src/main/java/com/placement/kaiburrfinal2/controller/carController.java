package com.placement.kaiburrfinal2.controller;
import com.placement.kaiburrfinal2.model.Id;
import com.placement.kaiburrfinal2.model.Car;

import com.placement.kaiburrfinal2.service.carservice;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.ui.Model;
import java.util.*;


@RequestMapping("/car")
@RequiredArgsConstructor
@Controller
public class carController {



    private final carservice carService;

    @PostMapping
    public ResponseEntity addCar(@RequestBody Car car) {
        carService.addCar(car);
        return  ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping
    public ResponseEntity putCar(@RequestBody Car car) {
        carService.putCar(car);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @GetMapping( {"/optional/{id}","/optional"})
    public ResponseEntity<?> getAllCar(@PathVariable(required = false) String id) {

        return ResponseEntity.ok(carService.getAllCar(id));


    }

    @GetMapping("/name/{name}")
    public ResponseEntity<Car> getCar(@PathVariable String name) {
        return ResponseEntity.ok().body(carService.getCar(name));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteCar(@PathVariable String id) {
        carService.deleteCar(id);
        return ResponseEntity.noContent().build();
    }
    @GetMapping("/save")
    public String showCar( Model model) {
        Car car=new Car();
        model.addAttribute("car",car);

        return "create";
    }
    @PostMapping("/save")
    public String submitForm(@ModelAttribute("car") Car car){
        System.out.println(car);
        return "create_success";
    }
    @GetMapping("/deleteCar/{id}")
    public String deletecar(@PathVariable("id")String id){
        carService.deleteCar(id);
        return "redirect:/create";
    }




}
