package com.bookMyShow.repositary;

import com.bookMyShow.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by satheesh on 10/10/17.
 */
public interface CityRepositary extends JpaRepository<City, Integer> {
    City findByName(String name);
}
