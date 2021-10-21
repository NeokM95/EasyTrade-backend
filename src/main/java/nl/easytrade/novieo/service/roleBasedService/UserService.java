package nl.easytrade.novieo.service.roleBasedService;

import nl.easytrade.novieo.exceptions.UserNotFoundException;
import nl.easytrade.novieo.model.User;
import nl.easytrade.novieo.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    // Attributes
    private final UserRepository userRepository;
    PasswordEncoder passwordEncoder;

    // Constructor
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Get Methods
    public Optional<User> getUser(String username) {
        return userRepository.findById(username);
    }

    // Post Methods

    // Put Methods
    public void updatePassword(String username, String newPassword) {
        Optional<User> userOptional = userRepository.findById(username);
        if (userOptional.isEmpty()) {
            throw new UserNotFoundException(username);
        } else {
            User user = userOptional.get();
            user.setPassword(passwordEncoder.encode(newPassword));
            userRepository.save(user);
        }
    }

    public void updateEmail(String username, String email) {
        Optional<User> userOptional = userRepository.findById(username);
        if (userOptional.isEmpty()) {
            throw new UserNotFoundException(username);
        } else {
            User user = userOptional.get();
            user.setEmail(email);
            userRepository.save(user);
        }
    }

    public void setMembership(String username) {
        Optional<User> userOptional = userRepository.findById(username);
        if (userOptional.isEmpty()) {
            throw new UserNotFoundException(username);
        } else {
            User user = userOptional.get();
            user.addAuthority("ROLE_MEMBER");
            userRepository.save(user);
        }
    }

    // Delete Methods


}
