package com.bookMyShow.controller;

import com.bookMyShow.model.City;
import com.bookMyShow.model.Event;
import com.bookMyShow.service.CityService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.List;

/**
 * Created by satheesh on 7/10/17.
 */
@Controller
@RequestMapping("/city")
public class BookMyShowController {
    @Autowired
    private CityService cityService;
    @GetMapping("/all")
    public ResponseEntity<List<City>> findAll()
    {
        List<City> cityList = cityService.findAll();
        return new ResponseEntity<List<City>>(cityList, HttpStatus.OK);
    }

    @GetMapping("events/{name}")
    public ResponseEntity<City> findByName(@PathVariable("name") String name)
    {
        City city = cityService.findByName(name);
        return new ResponseEntity<City>(city, HttpStatus.OK);
    }

}
    /*@GetMapping("/{id}")
    public ResponseEntity<City> getCityById(@PathVariable("id") Integer id)
    {
        City city = cityService.getCityById(id);
        return new ResponseEntity<City>(city, HttpStatus.OK);
    }
    @GetMapping("cities")
    public ResponseEntity<List<City>> getAllCities()
    {
        List<City> list = cityService.getAllCities();
        return new ResponseEntity<List<City>>(list, HttpStatus.OK);
    }
    @GetMapping("events/{id}")
    public ResponseEntity<List<Event>> getListOfEventsByCity(@PathVariable("id") Integer id)
    {
        List<Event> list = cityService.getListOfEventsByCity(id);
        return new ResponseEntity<List<Event>>(list, HttpStatus.OK);
    }
    @PostMapping("city")
    public ResponseEntity<Void> addCity(@RequestBody City city, UriComponentsBuilder builder)
    {
        boolean flag = cityService.addCity(city);
        if (flag == false) {
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/city/{id}").buildAndExpand(city.getCityId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
    @PutMapping("city")
    public ResponseEntity<City> updateCity(@RequestBody City city)
    {
        cityService.updateCity(city);
        return new ResponseEntity<City>(city, HttpStatus.OK);
    }
    @DeleteMapping("city/{id}")
    public ResponseEntity<Void> deleteCity(@PathVariable("id") Integer id)
    {
        cityService.deleteCity(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }*/
