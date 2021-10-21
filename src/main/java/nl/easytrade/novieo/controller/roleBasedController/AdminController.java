package nl.easytrade.novieo.controller.roleBasedController;

import nl.easytrade.novieo.dto.request.CreateUserRequest;
import nl.easytrade.novieo.service.roleBasedService.AdminService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/admin")
public class AdminController {

    // Attributes
    private final AdminService adminService;

    // Constructor
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    // Get Methods
    @GetMapping
    public ResponseEntity<Object> getUsers() {
        return ResponseEntity.ok().body(adminService.getUsers());
    }

    // Post Methods
    @PostMapping
    public ResponseEntity<Object> createAdmin(@RequestBody CreateUserRequest createUserRequest){
        String newUsername = adminService.createAdmin(createUserRequest);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{username}")
                .buildAndExpand(newUsername).toUri();

        return ResponseEntity.created(location).build();
    }

    // Put Methods

    // Delete Methods




}
