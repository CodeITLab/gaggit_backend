package codeit.lab.gaggit_backend.controllers;

import codeit.lab.gaggit_backend.models.User;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserAuthentication {
    @GetMapping(path = "/isUserLoggedIn")
    @ResponseBody
    public ResponseEntity Welcome(@RequestBody User user) {
        return new ResponseEntity(
                new User(0, "Ivan", true),
                HttpStatusCode.valueOf(200));

    }
}
