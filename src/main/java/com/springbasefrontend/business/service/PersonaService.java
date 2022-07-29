package com.springbasefrontend.business.service;

import com.springbasefrontend.domain.Persona;
import com.springbasefrontend.repository.PersonaRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {
    
    private final PersonaRepository personaRepository;
    
    public PersonaService(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }
    
    public List<Persona> buscarTodas() {
        return personaRepository.buscarTodas();
    }
    
}
