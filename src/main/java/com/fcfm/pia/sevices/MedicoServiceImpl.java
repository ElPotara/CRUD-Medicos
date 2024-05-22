package com.fcfm.pia.sevices;

import com.fcfm.pia.models.Medico;
import com.fcfm.pia.repository.MedicoRepository;
import com.fcfm.pia.utils.MedicoMapper;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class MedicoServiceImpl implements MedicoService{
    List<Medico> medicoList = new ArrayList<>();
    private MedicoRepository medicoRepository;
    @Autowired
    MedicoServiceImpl(MedicoRepository medicoRepository) {this.medicoRepository = medicoRepository;}
    public void createMedico(Medico newMedico){
        medicoRepository.insertar(MedicoMapper.medicoModelTomedicoEntity2(newMedico));
    }
    public Medico getMedicoById(int id){
        com.fcfm.pia.repository.entity.Medico medicoEntity = medicoRepository.getMedicoById(Long.valueOf(id));
        return MedicoMapper.medicoEntitytomedicoModel(medicoEntity);
    }
    @Override
    public void deleteMedico(int id) {medicoRepository.eliminar(Long.valueOf(id));}
    @Override
    public void updateMedico(int id, Medico updateMedico) {
        Medico existingMedico = getMedicoById(id);
        if (existingMedico != null) {
            existingMedico.setNombre(updateMedico.getNombre());
            existingMedico.setApellido_paterno(updateMedico.getApellido_paterno());
            existingMedico.setApellido_materno(updateMedico.getApellido_materno());
            existingMedico.setFecha_nacimiento(updateMedico.getFecha_nacimiento());
            existingMedico.setId_especialidad(updateMedico.getId_especialidad());
            existingMedico.setEmail(updateMedico.getEmail());
            existingMedico.setTelefono(updateMedico.getTelefono());
            existingMedico.setContraseña(updateMedico.getContraseña());
            existingMedico.setId_ciudad(updateMedico.getId_ciudad());
            existingMedico.setColonia(updateMedico.getColonia());
            existingMedico.setDomicilio(updateMedico.getDomicilio());
            medicoRepository.actualizar(MedicoMapper.medicoModelTomedicoEntity(existingMedico));
        }
    }
    @Override
    public List<Medico> getAllMedicos() {
        List<com.fcfm.pia.repository.entity.Medico> medicosEntityList = medicoRepository.getAllMedicos();
        List<Medico> medicoList = new ArrayList<>();
        for (com.fcfm.pia.repository.entity.Medico medicoEntity : medicosEntityList) {
            medicoList.add(MedicoMapper.medicoEntitytomedicoModel(medicoEntity));
        }
        return medicoList;
    }
}
