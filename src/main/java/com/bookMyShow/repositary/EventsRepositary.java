package com.bookMyShow.repositary;

import com.bookMyShow.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by satheesh on 10/10/17.
 */

public interface EventsRepositary extends JpaRepository<Event, Integer> {
    //List<Event> findByCityId(int cityId);
}
