package com.bookingsystem.graphqlapi.resolver.query;

import com.bookingsystem.graphqlapi.entities.Hotel;
import com.bookingsystem.graphqlapi.repositories.HotelRepository;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class HotelQueryResolver implements GraphQLQueryResolver {
    private final HotelRepository hotelRepository;

    @QueryMapping(name = "hotel")
    public Optional<Hotel> hotel(@Argument("id") Integer id) {
        return this.hotelRepository.findById(id);
    }

    @QueryMapping(name = "hotels")
    public List<Hotel> hotels() {
        return this.hotelRepository.findAll();
    }
}
