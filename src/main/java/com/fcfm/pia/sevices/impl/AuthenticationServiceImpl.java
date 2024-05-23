package com.fcfm.pia.sevices.impl;

import com.fcfm.pia.sevices.AuthenticacionService;
import org.springframework.stereotype.Service;
import com.fcfm.pia.sevices.MedicoService;
import com.fcfm.pia.repository.MedicoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationServiceImpl implements AuthenticacionService {
    @Autowired
    private MedicoService medicoService;
    @Autowired
    private MedicoRepository medicoRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private AuthenticationManager authenticationManager;

}
