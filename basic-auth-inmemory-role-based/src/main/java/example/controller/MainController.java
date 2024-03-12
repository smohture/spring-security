package example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MainController {
    @GetMapping("/public")
    public String home(){
        return "[public] from basic-auth-inmemory-role-based!";
    }

    @GetMapping("/admin")
    public String admin(){
        return "[admin] from basic-auth-inmemory-role-based!";
    }

    @GetMapping("/normal")
    public String student(){
        return "[normal] from basic-auth-inmemory-role-based!";
    }
}
