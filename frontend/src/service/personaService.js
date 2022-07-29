import axios from "axios"

const personaService = {

    buscarTodas: async () => {
        const response = await axios.get(`/api/persona`)
        return response.data;
    }

}

export default personaService;
