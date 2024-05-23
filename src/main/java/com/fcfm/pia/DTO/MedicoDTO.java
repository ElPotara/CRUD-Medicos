package com.fcfm.pia.DTO;

import lombok.*;
import java.sql.Date;
public class MedicoDTO {

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
}
