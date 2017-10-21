package com.bookMyShow.dao;

import com.bookMyShow.model.City;
import com.bookMyShow.model.Event;

import java.util.List;

/**
 * Created by satheesh on 7/10/17.
 */
public interface IBookMyShowDao {
    List<City> getAllCities();
    City getCityById(int cityId);
    List<Event> getListOfEventsByCityId(int cityId);
    void addCity(City city);
    void updateCity(City city);
    void deleteCity(int cityId);
    boolean cityExists(String cityName, String pincode);

}
