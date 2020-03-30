package com.dawes.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface ServicioUsuario {

	UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException;

}