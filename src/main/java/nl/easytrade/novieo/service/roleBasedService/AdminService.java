package nl.easytrade.novieo.service.roleBasedService;

import nl.easytrade.novieo.dto.request.CreateUserRequest;
import nl.easytrade.novieo.exceptions.BadRequestException;
import nl.easytrade.novieo.exceptions.UserNotFoundException;
import nl.easytrade.novieo.model.User;
import nl.easytrade.novieo.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class AdminService {

    // Attributes
    private final UserRepository userRepository;
    PasswordEncoder passwordEncoder;

    // Constructor
    public AdminService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    // Get Methodes
    public Collection<User> getUsers() {
        return userRepository.findAll();
    }


    // Post Methods
    public String createAdmin(CreateUserRequest createUserRequest) {
        try {
            String encryptedPassword = passwordEncoder.encode(createUserRequest.getPassword());

            User user = new User();
            user.setUsername(createUserRequest.getUsername());
            user.setPassword(encryptedPassword);
//            user.setEmail(createUserRequest.getEmail());
            user.setEnabled(true);
            user.addAuthority("ROLE_USER");
            user.addAuthority("ROLE_MEMBER");
            user.addAuthority("ROLE_ADMIN");
//            for (String s : createUserRequest.getAuthorities()) {
//                if (!s.startsWith("ROLE_")) {
//                    s = "ROLE_" + s;
//                }
//                user.addAuthority(s);
//            }

            User newUser = userRepository.save(user);
            return newUser.getUsername();
        }
        catch (Exception ex) {
            throw new BadRequestException("Cannot create admin.");
        }

    }

    // Update Methods

    // Delete Methods

}
