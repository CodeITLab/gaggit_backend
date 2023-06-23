package codeit.lab.gaggit_backend.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
    @RequestMapping(value = "/welcome")
    public String Welcome() {
        return "Welcome to Gaggit";
    }
}
