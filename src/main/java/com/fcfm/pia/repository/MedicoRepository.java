package com.fcfm.pia.repository;
import com.fcfm.pia.repository.entity.Medico;
import java.util.List;

public interface MedicoRepository {
    void insertar(Medico medico);
    Medico getMedicoById(Long id);
    void eliminar(Long id);
    void actualizar(Medico medico);
    List<Medico> getAllMedicos();
}
