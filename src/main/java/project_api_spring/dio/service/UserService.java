package project_api_spring.dio.service;

import project_api_spring.dio.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
