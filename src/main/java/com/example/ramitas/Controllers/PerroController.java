package com.example.ramitas.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PerroController {

    @GetMapping("/main")
    public String principal(){
        return "principal";
    }


}
