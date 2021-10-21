package nl.easytrade.novieo.service.roleBasedService;

import nl.easytrade.novieo.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    // Attributes
    private final UserRepository userRepository;

    // Constructor
    public MemberService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Get Methods

    // Post Methods

    // Update Methods

    // Delete Methods

}
