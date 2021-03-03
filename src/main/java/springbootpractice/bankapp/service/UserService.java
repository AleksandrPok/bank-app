package springbootpractice.bankapp.service;

import springbootpractice.bankapp.model.User;

public interface UserService {
    User save(User user);

    User getById(Long id);

    User getByPhoneNumber(String phoneNumber);

    void remove(Long id);
}
