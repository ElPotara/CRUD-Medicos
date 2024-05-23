package com.fcfm.pia.repository;
import com.fcfm.pia.repository.entity.Medico;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

public interface MedicoRepository extends CrudRepository<Medico, Long>{

    public Optional<Medico> findByEmail(String email);
}
