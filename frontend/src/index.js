import React from 'react';
import PersonaPage from './pages/personaPage';
import OtraPagina from './pages/otraPagina';
import ReactDOM from 'react-dom/client';
import {
    BrowserRouter,
    Routes,
    Route,
    Navigate,
} from 'react-router-dom';

const root = ReactDOM.createRoot(
    document.getElementById('root')
);

root.render(
    <BrowserRouter>
        <Routes>
            <Route path='/' element={<PersonaPage />} />
            <Route path='/otra' element={<OtraPagina />} />
            {/* <Route path='/home' element={<Navigate to='/' />} /> */}
        </Routes>
    </BrowserRouter>
);