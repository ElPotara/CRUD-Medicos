package com.fcfm.pia.repository;
import com.fcfm.pia.repository.entity.Medico;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface MedicoRepository {
    void insertar(Medico medico);
    Medico getMedicoById(Long id);
    void eliminar(Long id);
    void actualizar(Medico medico);
    List<Medico> getAllMedicos();

    public Optional<Medico> findByEmail(String email);
}
