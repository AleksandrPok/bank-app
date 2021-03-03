package springbootpractice.bankapp.service;

import java.util.Optional;
import springbootpractice.bankapp.model.User;

public interface UserService {
    User save(User user);

    Optional<User> getById(Long id);

    Optional<User> getByPhoneNumber(String phoneNumber);

    void remove(Long id);

}
