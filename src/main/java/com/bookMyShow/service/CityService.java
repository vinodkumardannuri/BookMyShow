package com.bookMyShow.service;

import com.bookMyShow.dao.IBookMyShowDao;
import com.bookMyShow.model.City;
import com.bookMyShow.model.Event;
import com.bookMyShow.repositary.CityRepositary;
import com.bookMyShow.repositary.EventsRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by satheesh on 7/10/17.
 */

@Service
@Transactional
@Repository
public class CityService {

    @Autowired
    private CityRepositary cityRepositary;

    @Autowired
    private EventsRepositary eventsRepositary;

    public List<City> findAll(){
        return cityRepositary.findAll();
    }

    public City findByName(String name){
       return cityRepositary.findByName(name);
    }

}
    /*@Autowired
    private IBookMyShowDao cityDAO;
    @Override
    public City getCityById(int cityId)
    {
        City obj = cityDAO.getCityById(cityId);
        return obj;
    }

    @Override
    public List<Event> getListOfEventsByCity(int cityId) {
        return cityDAO.getListOfEventsByCityId(cityId);
    }

    @Override
    public List<City> getAllCities()
    {
        return cityDAO.getAllCities();
    }
    @Override
    public synchronized boolean addCity(City city)
    {
        if (cityDAO.cityExists(city.getName(), city.getPincode())) {
            return false;
        } else {
            cityDAO.addCity(city);
            return true;
        }
    }
    @Override
    public void updateCity(City city)
    {
        cityDAO.updateCity(city);
    }
    @Override
    public void deleteCity(int cityId)
    {
        cityDAO.deleteCity(cityId);
    }*/

