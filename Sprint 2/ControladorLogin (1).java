//package com.example.sprint1.controlador;

//import com.example.sprint1.interfaz.LoginIterface;

public class ControladorLogin implements LoginIterface.Controlador {

    private final LoginIterface.View view;

    public ControladorLogin(LoginIterface.View view) {
        this.view = view;
    }


    @Override
    public boolean validarLogin(String editText, String indicador) {
        if(editText.trim().isEmpty()){
            view.validarResultado(indicador, "Los campos no pueden estar vaciós");
            return false;
        }else{
            if(editText.length()<=4){
                view.validarResultado(indicador, "Los campos deben ser mayores o igual a 5 caracteres");
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean usuarioPermitido(String usuario, String password) {
        if(usuario.equals("prueba") && password.equals("12345")){
            view.esUsuarioAutorizado(true);
            return true;
        }else{
            view.esUsuarioAutorizado(false);
            return false;
        }
    }
}
