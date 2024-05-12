/*package com.example.sprint1.controlador;

import com.example.sprint1.Modelos.TurnoDto;
import com.example.sprint1.interfaz.InicioIterface;*/

public class ControladorInicio implements InicioIterface.Controlador {
    private InicioIterface.View view;
    public ControladorInicio(InicioIterface.View view) {
        this.view = view;
    }
    @Override
    public boolean recuperarTurno() {// ojo
        // if(identificacion.equals("123456")){
        TurnoDto  turno = new TurnoDto();
        turno.setEps("EPS SURA");
        turno.setNumero_turno("10");
        turno.setSintomas("Fiebre");
        turno.setPaciente("Pruebas Garcia");
        view.mostrarTurno(turno);
        return true;
        /*}else{
            view.mostrarTurno(null);
            return false;
        }*/
    }
    @Override
    public void salirApp() {
        view.respuestaSalirApp();
    }
}