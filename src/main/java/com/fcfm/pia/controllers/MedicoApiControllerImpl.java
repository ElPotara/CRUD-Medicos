package com.fcfm.pia.controllers;

import com.fcfm.pia.controllers.MedicoApiController;
import com.fcfm.pia.models.Medico;
import com.fcfm.pia.sevices.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
public class MedicoApiControllerImpl implements MedicoApiController  {
    private MedicoService medicoService;

    @Autowired
    MedicoApiControllerImpl(MedicoService medicoService){this.medicoService = medicoService;}

    @Override
    public ResponseEntity<Medico> createMedico(@RequestBody Medico medicoNuevo){
        medicoService.createMedico(medicoNuevo);
        return ResponseEntity.ok().body(medicoNuevo);
    }
    @Override
    public ResponseEntity<Medico> getMedicoById(@PathVariable int idMedico){
        return ResponseEntity.ok().body(medicoService.getMedicoById(idMedico));
    }
    @Override
    public ResponseEntity<Void> deleteMedico(@PathVariable int idMedico) {
        medicoService.deleteMedico(idMedico);
        return ResponseEntity.ok().build();
    }
    @Override
    public ResponseEntity<Medico> updateMedico(@PathVariable int idMedico, @RequestBody Medico medicoActualizado) {
        medicoService.updateMedico(idMedico, medicoActualizado);
        return ResponseEntity.ok().build();
    }
    @Override
    public ResponseEntity<List<Medico>> getAllMedicos() {
        List<Medico> medicosList = medicoService.getAllMedicos();
        return ResponseEntity.ok().body(medicosList);
    }
}
