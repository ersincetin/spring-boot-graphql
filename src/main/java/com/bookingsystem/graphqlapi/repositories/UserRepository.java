package com.bookingsystem.graphqlapi.repositories;

import com.bookingsystem.graphqlapi.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
