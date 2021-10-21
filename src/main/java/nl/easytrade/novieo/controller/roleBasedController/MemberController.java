package nl.easytrade.novieo.controller.roleBasedController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    // TODO:
    // - setApiKey
    // - setRMP

    // FUTURE:
    // - alle trade gerelateerde methodes

@RestController
@RequestMapping(value="/members")
public class MemberController {

    @GetMapping
    public ResponseEntity<Object> getMessage() {
        return new ResponseEntity<>("SECURED REST endpoint: /member", HttpStatus.OK);
    }

}
