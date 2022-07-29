package com.springbasefrontend.repository;

import com.springbasefrontend.domain.Persona;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class PersonaRepository {
    
    public List<Persona> buscarTodas() {
        Persona unaPersona = new Persona();
        unaPersona.setNombre("Fulanito");
        Persona otraPersona = new Persona();
        otraPersona.setNombre("Pepito");
        List<Persona> personas = new ArrayList<>();
        personas.add(unaPersona);
        personas.add(otraPersona);
        return personas;
    }
    
}
