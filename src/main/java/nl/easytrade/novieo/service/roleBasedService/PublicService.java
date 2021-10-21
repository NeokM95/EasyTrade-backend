package nl.easytrade.novieo.service.roleBasedService;

import nl.easytrade.novieo.dto.request.CreateUserRequest;
import nl.easytrade.novieo.exceptions.BadRequestException;
import nl.easytrade.novieo.model.User;
import nl.easytrade.novieo.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class PublicService {

    // Attributes
    private final UserRepository userRepository;
    PasswordEncoder passwordEncoder;

    public PublicService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    // Constructor

    // Get Methods

    // Post Methods
    public String createUser(CreateUserRequest createUserRequest) {
        try {
            String encryptedPassword = passwordEncoder.encode(createUserRequest.getPassword());

            User user = new User();
            user.setUsername(createUserRequest.getUsername());
            user.setPassword(encryptedPassword);
//            user.setEmail(createUserRequest.getEmail());
            user.setEnabled(true);
            user.addAuthority("ROLE_USER");
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
            throw new BadRequestException("Cannot create user.");
        }

    }

    // Update Methods

    // Delete Methods
}
