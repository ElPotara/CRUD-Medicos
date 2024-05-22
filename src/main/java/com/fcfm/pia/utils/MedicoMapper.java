package com.fcfm.pia.utils;
import com.fcfm.pia.repository.entity.Medico;


public class MedicoMapper {
    public static com.fcfm.pia.models.Medico medicoEntitytomedicoModel(Medico medico){
        com.fcfm.pia.models.Medico model = new com.fcfm.pia.models.Medico();
        model.setId_medico(medico.getId_medico().intValue());
        model.setNombre(medico.getNombre());
        model.setApellido_paterno(medico.getApellido_paterno());
        model.setApellido_materno(medico.getApellido_materno());
        model.setFecha_nacimiento(medico.getFecha_nacimiento());
        //        model.setFechaNac(alumno.getFechaNac().toString()); njnvjvn
        model.setId_especialidad(medico.getId_especialidad());
        model.setEmail(medico.getEmail());
        model.setTelefono(medico.getTelefono());
        model.setContraseña(medico.getContraseña());
        model.setId_ciudad(medico.getId_ciudad());
        model.setColonia(medico.getColonia());
        model.setDomicilio(medico.getDomicilio());
        return model;
    }

    public static  Medico medicoModelTomedicoEntity(com.fcfm.pia.models.Medico medico){
        Medico entity = new  com.fcfm.pia.repository.entity.Medico();
        entity.setId_medico(Long.valueOf(medico.getId_medico()));
        entity.setNombre(medico.getNombre());
        entity.setApellido_paterno(medico.getApellido_paterno());
        entity.setApellido_materno(medico.getApellido_materno());
        entity.setFecha_nacimiento(medico.getFecha_nacimiento());
        //entity.setFechaNac(Date.valueOf(alumno.getFechaNac()));
        entity.setId_especialidad(medico.getId_especialidad());
        entity.setEmail(medico.getEmail());
        entity.setTelefono(medico.getTelefono());
        entity.setContraseña(medico.getContraseña());
        entity.setId_ciudad(medico.getId_ciudad());
        entity.setColonia(medico.getColonia());
        entity.setDomicilio(medico.getDomicilio());
        return entity;
    }

    public static  Medico medicoModelTomedicoEntity2(com.fcfm.pia.models.Medico medico){
        Medico entity = new  com.fcfm.pia.repository.entity.Medico();
        entity.setNombre(medico.getNombre());
        entity.setApellido_paterno(medico.getApellido_paterno());
        entity.setApellido_materno(medico.getApellido_materno());
        entity.setFecha_nacimiento(medico.getFecha_nacimiento());
        //entity.setFechaNac(Date.valueOf(alumno.getFechaNac()));
        entity.setId_especialidad(medico.getId_especialidad());
        entity.setEmail(medico.getEmail());
        entity.setTelefono(medico.getTelefono());
        entity.setContraseña(medico.getContraseña());
        entity.setId_ciudad(medico.getId_ciudad());
        entity.setColonia(medico.getColonia());
        entity.setDomicilio(medico.getDomicilio());
        return entity;
    }
}
