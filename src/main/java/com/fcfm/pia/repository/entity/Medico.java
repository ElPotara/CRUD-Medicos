package com.fcfm.pia.repository.entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_medico", nullable = false)
    private Long id_medico;
    private String nombre;
    private String apellido_paterno;
    private String apellido_materno;
    private Date fecha_nacimiento;
    private int id_especialidad;
    private String email;
    private String telefono;
    private String contraseña;
    private int id_ciudad;
    private String colonia;
    private String domicilio;

    public Medico(String nombre, String apellido_paterno, String apellido_materno, Date fecha_nacimiento, int id_especialidad, String email, String telefono, String contraseña, int id_ciudad, String colonia, String domicilio){
        this.nombre=nombre;
        this.apellido_paterno=apellido_paterno;
        this.apellido_materno=apellido_materno;
        this.fecha_nacimiento=fecha_nacimiento;
        this.id_especialidad=id_especialidad;
        this.email=email;
        this.telefono=telefono;
        this.contraseña=contraseña;
        this.id_ciudad=id_ciudad;
        this.colonia=colonia;
        this.domicilio=domicilio;
    }

    public Medico(){
    }

    public Long getId_medico() {
        return id_medico;
    }

    public void setId_medico(Long id_medico) {
        this.id_medico = id_medico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public int getId_especialidad() {
        return id_especialidad;
    }

    public void setId_especialidad(int id_especialidad) {
        this.id_especialidad = id_especialidad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getId_ciudad() {
        return id_ciudad;
    }

    public void setId_ciudad(int id_ciudad) {
        this.id_ciudad = id_ciudad;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
}
