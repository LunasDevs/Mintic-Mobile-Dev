//package com.example.sprint1.interfaz;
//import com.example.sprint1.Modelos.FormularioDTO;

public interface FormularioInterfaz {

    interface View{
        void validarResultado(String  indicador, String mensaje);
        void respuestaGuardar(boolean respuesta);
    }

    interface Controlador{
        boolean validarFormulario(FormularioDTO formularioDTO);
        boolean usuarioGuardarUsuario(FormularioDTO formularioDTO);
    }
    interface Modelo{}
}