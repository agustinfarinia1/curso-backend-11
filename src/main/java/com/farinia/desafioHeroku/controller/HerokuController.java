package com.farinia.desafioHeroku.controller;

import com.farinia.desafioHeroku.model.Mensajes;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HerokuController {
    @GetMapping("/ej")
    public Mensajes getHeroku(){
        return new Mensajes("Bienvenido Heroku!");
    }
}
