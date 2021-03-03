package springbootpractice.bankapp.service;

import javax.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import springbootpractice.bankapp.model.User;
import springbootpractice.bankapp.repository.UserRepository;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getById(Long id) {
        return userRepository.getById(id).orElseThrow(
                () -> new EntityNotFoundException("Can't get user with id : " + id));
    }

    @Override
    public User getByPhoneNumber(String phoneNumber) {
        return userRepository.getByPhoneNumber(phoneNumber).orElseThrow(() ->
                new EntityNotFoundException("Can't get user with phone number: " + phoneNumber));
    }

    @Override
    public void remove(Long id) {
        userRepository.deleteById(id);
    }
}
