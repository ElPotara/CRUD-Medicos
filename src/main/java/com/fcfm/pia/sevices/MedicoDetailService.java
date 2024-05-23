package com.fcfm.pia.sevices;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.fcfm.pia.repository.entity.Medico;
import com.fcfm.pia.repository.MedicoRepository;

import java.util.ArrayList;
import java.util.Objects;

@Service
public class MedicoDetailService implements UserDetailService{
    @Autowired
    private MedicoRepository medicoRepository;

    private Medico medicoDetails;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        medicoDetails = medicoRepository.findByEmail(username).get();
        if(!Objects.isNull(medicoDetails)){
            return new User(medicoDetails.getEmail(), medicoDetails.getContraseña(), new ArrayList<>());
        } else{
            throw new UsernameNotFoundException("Medico no encontrado");
        }
    }

    public Medico getMedicoDetails(){
        return medicoDetails;
    }


}
