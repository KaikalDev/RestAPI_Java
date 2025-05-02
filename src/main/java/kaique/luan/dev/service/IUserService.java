package kaique.luan.dev.service;

import kaique.luan.dev.domain.model.User;

public interface IUserService {
    User findById(Long id);

    User create(User userToCreate);
}
