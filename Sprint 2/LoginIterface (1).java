//package com.example.sprint1.interfaz;

public interface LoginIterface {

    interface View{
        void validarResultado(String  indicador, String mensaje);
        void esUsuarioAutorizado(boolean estado);
    }
    interface  Controlador{
        boolean validarLogin(String editText, String indicador);
        boolean usuarioPermitido(String usuario, String password);

    }
    interface Modelo{}

}
