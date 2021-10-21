package nl.easytrade.novieo.controller.roleBasedController;

import nl.easytrade.novieo.dto.request.CreateUserRequest;
import nl.easytrade.novieo.service.roleBasedService.PublicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
public class PublicController {

    private final PublicService publicService;

    @Autowired
    public PublicController(PublicService publicService) {
        this.publicService = publicService;
    }


    // This Method is in the public controller because everybody should be able to create a user (an account to our platform).
    @PostMapping(value = "/create-user")
    public ResponseEntity<Object> createUser(@RequestBody CreateUserRequest createUserRequest) {

        String newUsername = publicService.createUser(createUserRequest);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{username}")
                .buildAndExpand(newUsername).toUri();

        return ResponseEntity.created(location).build();
    }

}
