package kaique.luan.dev.service;

import kaique.luan.dev.domain.model.User;

public interface IUserService {
    User findUserById(Long id);

    User createUser(User userToCreate);
}
