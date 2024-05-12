/*package com.example.sprint1.interfaz;

import com.example.sprint1.Modelos.TurnoDto;*/

public interface InicioIterface {

    interface View{
        void mostrarTurno(TurnoDto turno);
        void respuestaSalirApp();
    }
    interface Controlador{
        boolean recuperarTurno();
        void salirApp();
    }
    interface Modelo{}

}
