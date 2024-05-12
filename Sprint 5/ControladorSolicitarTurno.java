/*package com.example.sprint1.controlador;

import com.example.sprint1.Modelos.FormularioTurnoDTO;
import com.example.sprint1.interfaz.SolicitarTurnoInterfaz;*/

public class ControladorSolicitarTurno implements SolicitarTurnoInterfaz.Controlador {

    private SolicitarTurnoInterfaz.View view;

    public ControladorSolicitarTurno(SolicitarTurnoInterfaz.View view) {
        this.view = view;
    }


    @Override
    public boolean validarFormulario(FormularioTurnoDTO formularioDto) {
        if(formularioDto.getNumeroCedula().trim().isEmpty()){
            view.validarResultadoFormulario( "El campo CC no puede estar vacio!", "cedula");
            return false;
        }else if(formularioDto.getEps().equalsIgnoreCase("Seleccione la EPS")){
            view.validarResultadoFormulario("Seleccione una EPS", "eps");

            return false;
        }else if(formularioDto.getDireccion().trim().isEmpty()){
            view.validarResultadoFormulario( "El campo Dirección no puede estar vacío!", "direccion");
            return false;
        }
        return true;
    }

    @Override
    public void buscarTurno(FormularioTurnoDTO formularioDto) {
        // actividad turno
        view.respuestaBusquedaEps(true);
    }
}