package nl.easytrade.novieo.controller.roleBasedController;

import nl.easytrade.novieo.model.User;
import nl.easytrade.novieo.service.roleBasedService.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "users")
public class UserController {

    // Attributes
    private final UserService userService;

    // Constructor
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Get Methods
    @GetMapping(value = "/{username}")
    public ResponseEntity<Object> getUserByUsername(@PathVariable("username") String username) {
        return ResponseEntity.ok().body(userService.getUser(username));
    }

    // Post Methods

    // Put Methods
    @PutMapping("/{username}/changePassword")
    public ResponseEntity<Object> changePassword(
            @PathVariable("username") String username,
            @RequestBody User user) {
        userService.updatePassword(username, user.getPassword());
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{username}/changeEmail")
    public ResponseEntity<Object> changeEmail(
            @PathVariable("username") String username,
            @RequestBody User user) {
        userService.updateEmail(username, user.getEmail());
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{username}/purchaseMembership")
    public ResponseEntity<Object> purchaseMembership(
            @PathVariable("username") String username) {
        userService.setMembership(username);
        return ResponseEntity.noContent().build();
    }

    // Delete Methods



}
