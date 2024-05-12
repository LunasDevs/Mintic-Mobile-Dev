/*package com.example.sprint1.interfaz;

import com.example.sprint1.Modelos.FormularioTurnoDTO;
import com.example.sprint1.Modelos.FormularioTurnoDTO;*/

public interface SolicitarTurnoInterfaz {


    interface  View{
        void validarResultadoFormulario( String mensaje, String identificador);
        void respuestaBusquedaEps(boolean estado);
    }
    interface  Controlador{
        boolean validarFormulario(FormularioTurnoDTO formularioDto);
        void buscarTurno(FormularioTurnoDTO formularioDto);
    }
    interface  Modelo{}

}