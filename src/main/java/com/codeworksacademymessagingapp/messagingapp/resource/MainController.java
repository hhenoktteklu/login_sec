package com.codeworksacademymessagingapp.messagingapp.resource;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/all")
    public String all(){
        return "all";
    }

    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping("/secure")
    public String secure(){
        return "secure";
    }
}
