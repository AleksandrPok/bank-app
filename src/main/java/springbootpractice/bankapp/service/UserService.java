package springbootpractice.bankapp.service;

import java.util.Optional;
import springbootpractice.bankapp.model.User;

public interface UserService {
    User save(User user);

    void delete(Long id);

    User update(User user);

    Optional<User> getById(Long id);

    Optional<User> getByPhoneNumber(String phoneNumber);
}
