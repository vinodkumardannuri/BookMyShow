/*package com.bookMyShow.dao;

import com.bookMyShow.model.City;
import com.bookMyShow.model.Event;
import com.bookMyShow.repositary.EventsRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;*/

/**
 * Created by satheesh on 7/10/17.
 */
/*@Transactional
@Repository
public class BookMyShowDAO implements IBookMyShowDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private EventsRepositary eventManager;

    @Override
    public City getCityById(int cityId)
    {
        return entityManager.find(City.class, cityId);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Event> getListOfEventsByCityId(int cityId)
    {
        return eventManager.findByCityId(cityId);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<City> getAllCities()
    {
        String hql = "SELECT city FROM City city ORDER BY city.cityId";
        return (List<City>) entityManager.createQuery(hql).getResultList();
    }
    @Override
    public void addCity(City city)
    {
        entityManager.persist(city);
    }
    @Override
    public void updateCity(City city)
    {
        City city1 = getCityById(city.getCityId());
        city1.setName(city.getName());
        city1.setPincode(city.getPincode());
        entityManager.flush();
    }
    @Override
    public void deleteCity(int cityId)
    {
        entityManager.remove(getCityById(cityId));
    }
    @Override
    public boolean cityExists(String title, String pincode)
    {
        String hql = "SELECT city FROM City as city WHERE city.cityId =?";
        int count = entityManager.createQuery(hql).setParameter(1, title)
                .setParameter(2, pincode).getResultList().size();
        return count > 0 ? true : false;
    }
}*/
