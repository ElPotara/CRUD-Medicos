package com.fcfm.pia.sevices;

import com.fcfm.pia.models.Medico;
import java.util.List;
public interface MedicoService  {
    void createMedico(Medico newMedico);
    Medico getMedicoById(int id);
    void deleteMedico(int id);
    void updateMedico(int id, Medico updateMedico);

    List<Medico> getAllMedicos();
}
