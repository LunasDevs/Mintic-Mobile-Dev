//package com.example.sprint1.controlador;
//import com.example.sprint1.Modelos.FormularioDTO;
//import com.example.sprint1.Modelos.UsuarioDto;
//import com.example.sprint1.interfaz.FormularioInterfaz;

public class ControladorFormulario implements FormularioInterfaz.Controlador {

    private  final FormularioInterfaz.View view;

    public ControladorFormulario(FormularioInterfaz.View view) {
        this.view = view;
    }

    @Override
    public boolean validarFormulario(FormularioDTO formularioDTO) {

        if (formularioDTO.getEditCedula().trim().isEmpty()){
            view.validarResultado("cedula", "El campo CC no puede estar vacio!");
            return false;
        } else if (formularioDTO.getEditFecha().trim().isEmpty()){
            view.validarResultado("fecha", "El campo fecha no puede estar vacio!");
            return false;
        }else if (formularioDTO.getSpEps().equalsIgnoreCase("Seleccione una EPS")){
            view.validarResultado("eps", "Seleccione una EPS");
            return false;
        }
        //EXPRESIONES REGULARES PARA CONTROLAR LA FECHA

        else if (!formularioDTO.getEditFecha().trim().matches("\\d{4}-\\d{2}-\\d{2}")){
            view.validarResultado("fecha", "El formato de la fecha no es correcto");
            return false;
        }


        else if (formularioDTO.getEditDireccion().trim().isEmpty()){
            view.validarResultado("direccion", "El campo dirección no puede estar vacio!");
            return false;
        }else if (formularioDTO.getEditCiudad().trim().isEmpty()){
            view.validarResultado("ciudad", "El campo ciudad no puede estar vacio!");
            return false;
        }else if (formularioDTO.getEditDepartamento().trim().isEmpty()){
            view.validarResultado("departamento", "El campo departamento no puede estar vacio!");
            return false;
        }else if (formularioDTO.getEditPassword().trim().isEmpty()){
            view.validarResultado("password", "El campo debe tener minimo seis caractereres!");
            return false;
        }else if (formularioDTO.getEditPassword().trim().length() < 6){
            view.validarResultado("password", "El campo debe tener minimo seis caractereres!");
            return false;
        }else if (formularioDTO.getEditNombreCompleto().trim().isEmpty()){
            view.validarResultado("nombre", "El campo nombre no puede estar vacio!");
            return false;
        }

        return true;
    }

    @Override
    public boolean usuarioGuardarUsuario(FormularioDTO formularioDTO) {

        if(formularioDTO != null) {
            UsuarioDto u = UsuarioDto.getInstance();
            //UsuarioDto i = new UsuarioDto(); LA LINEA DE ARRIBA REALIZA LA MISMA FUNCIÓN QUE ESTA

            u.setNumero_cedula(formularioDTO.getEditCedula());
            u.setFecha_nacimiento(formularioDTO.getEditFecha());
            u.setEps(formularioDTO.getSpEps());
            u.setCiudad(formularioDTO.getEditCiudad());
            u.setDireccion(formularioDTO.getEditDireccion());
            u.setDepartamento(formularioDTO.getEditDepartamento());
            u.setPassword(formularioDTO.getEditPassword());
            u.setNombre_completo(formularioDTO.getEditNombreCompleto());

            view.respuestaGuardar(true);

            return true;

        } else {
            view.respuestaGuardar(false);
            return false;
        }

    }
}