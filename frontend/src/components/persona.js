import React, { useEffect, useState } from 'react';
import personaService from '../service/personaService';

function Persona() {

    const [personas, setPersonas] = useState([]);

    useEffect(() => {
        buscarTodas();
    }, []);
    
    const buscarTodas = async () => {
        const personas = await personaService.buscarTodas();
        setPersonas(personas);
    }

    return (
        <>
            <h1>Personas...</h1>

            <ul>
                {personas.map((persona, index) => <li key={index}>{persona.nombre}</li>)}
            </ul>
        </>
    );
    
}

export default Persona;