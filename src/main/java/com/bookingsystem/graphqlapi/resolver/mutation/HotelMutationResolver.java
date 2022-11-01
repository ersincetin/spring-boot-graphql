package com.bookingsystem.graphqlapi.resolver.mutation;

import com.bookingsystem.graphqlapi.repositories.HotelRepository;
import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class HotelMutationResolver implements GraphQLMutationResolver {
    private final HotelRepository hotelRepository;
}
