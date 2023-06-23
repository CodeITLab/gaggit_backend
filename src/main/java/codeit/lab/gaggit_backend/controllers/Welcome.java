package codeit.lab.gaggit_backend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Welcome {
    @RequestMapping("/welcome")
    public String Welcome() {
        return "Welcome to Gaggit";
    }
}
