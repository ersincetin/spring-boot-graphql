package com.bookingsystem.graphqlapi.repositories;

import com.bookingsystem.graphqlapi.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer> {
}
