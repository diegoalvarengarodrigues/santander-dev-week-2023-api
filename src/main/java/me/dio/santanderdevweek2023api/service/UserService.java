package me.dio.santanderdevweek2023api.service;

import me.dio.santanderdevweek2023api.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
