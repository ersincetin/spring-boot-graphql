package com.bookingsystem.graphqlapi.resolver.query;

import com.bookingsystem.graphqlapi.entities.User;
import com.bookingsystem.graphqlapi.repositories.UserRepository;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class UserQueryResolver implements GraphQLQueryResolver {
    private final UserRepository userRepository;

    public Optional<User> user(Integer id) {
        return this.userRepository.findById(id);
    }

    public List<User> users() {
        return this.userRepository.findAll();
    }
}
