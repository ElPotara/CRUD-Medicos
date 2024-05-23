package com.fcfm.pia.sevices;

import org.springframework.http.ResponseEntity;
import com.fcfm.pia.DTO.MedicoDTO;
import com.fcfm.pia.DTO.LoginResponse;
import com.fcfm.pia.DTO.MedicoLoginDTO;
import com.fcfm.pia.repository.entity.Medico;


public interface AuthenticacionService {
    public ResponseEntity<MedicoDTO> signup(Medico medico);

    public ResponseEntity<LoginResponse> login(MedicoLoginDTO medicoLoginDTO);
}
