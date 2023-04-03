package com.example.ramitas.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GatosController {

    @GetMapping("/gatos")
    public String miau(){
        return "felino";
    }


}
