package com.bookMyShow.service;

import com.bookMyShow.model.City;
import com.bookMyShow.model.Event;

import java.util.List;

/**
 * Created by satheesh on 7/10/17.
 */
public interface ICityService
{
    List<City> getAllCities();
    City getCityById(int cityId);
    List<Event> getListOfEventsByCity(int cityId);
    boolean addCity(City city);
    void updateCity(City city);
    void deleteCity(int cityId);
}
