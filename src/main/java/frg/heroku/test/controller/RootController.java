package frg.heroku.test.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/")
public class RootController {
    @GetMapping("")
    public String hello() {
        return "Hello from Feda And Heroku Test RootController class!!!";
    }
}
