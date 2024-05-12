//package com.example.sprint1.Modelos;

public class UsuarioDto {

    private String numero_cedula;
    private String fecha_nacimiento;
    private String eps;
    private String password;
    private String ciudad;
    private String direccion;
    private String departamento;
    private String nombre_completo;

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    private static UsuarioDto instance = new UsuarioDto();

    public static UsuarioDto getInstance() {
        return instance;
    }

    public static void setInstance(UsuarioDto instance) {
        UsuarioDto.instance = instance;
    }


    public String getNumero_cedula() {
        return numero_cedula;
    }

    public void setNumero_cedula(String numero_cedula) {
        this.numero_cedula = numero_cedula;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }



    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }



}
