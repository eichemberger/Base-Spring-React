package com.springbasefrontend.controller.rest;

import com.springbasefrontend.business.service.PersonaService;
import com.springbasefrontend.domain.Persona;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaRestController {
    
    private final PersonaService personaService;
    
    public PersonaRestController(PersonaService personaService) {
        this.personaService = personaService;
    }
    
    @GetMapping("/api/persona")
    public List<Persona> buscarTodas() {
        return personaService.buscarTodas();
    }
    
}
