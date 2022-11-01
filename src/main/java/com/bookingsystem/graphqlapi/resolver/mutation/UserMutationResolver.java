package com.bookingsystem.graphqlapi.resolver.mutation;

import com.bookingsystem.graphqlapi.entities.User;
import com.bookingsystem.graphqlapi.repositories.UserRepository;
import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class UserMutationResolver implements GraphQLMutationResolver {
    private final UserRepository userRepository;

    @QueryMapping(name = "user")
    public Optional<User> user(@Argument("id") Integer id) {
        return this.userRepository.findById(id);
    }

    @QueryMapping(name = "users")
    public List<User> users() {
        return this.userRepository.findAll();
    }
}
