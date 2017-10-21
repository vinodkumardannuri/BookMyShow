package com.bookMyShow.repositary;

import com.bookMyShow.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by satheesh on 10/10/17.
 */
public interface LoacationRepositary extends JpaRepository<Location, Integer> {
}
