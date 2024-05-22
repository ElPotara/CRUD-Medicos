package com.fcfm.pia.controllers;

import com.fcfm.pia.models.Medico;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RequestMapping("/medico")
public interface MedicoApiController {
    @PostMapping("/")
    ResponseEntity<Medico> createMedico(@RequestBody Medico medicoNuevo);
    @GetMapping("/{idMedico}")
    ResponseEntity<Medico> getMedicoById(@PathVariable int idMedico);
    @DeleteMapping("/{idMedico}")
    ResponseEntity<Void> deleteMedico(@PathVariable int idMedico);
    @PutMapping("/{idMedico}")
    ResponseEntity<Medico> updateMedico(@PathVariable int idMedico, @RequestBody Medico medicoActualizado);
    @GetMapping("/")
    ResponseEntity<List<Medico>> getAllMedicos();
}
