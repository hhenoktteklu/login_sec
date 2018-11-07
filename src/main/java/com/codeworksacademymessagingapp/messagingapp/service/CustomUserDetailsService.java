package com.codeworksacademymessagingapp.messagingapp.service;

import com.codeworksacademymessagingapp.messagingapp.model.CustomUserDetails;
import com.codeworksacademymessagingapp.messagingapp.model.Users;
import com.codeworksacademymessagingapp.messagingapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;

public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Users> optionalUsers = userRepository.findByFirstName(username);

        optionalUsers.orElseThrow(() -> new UsernameNotFoundException("User name not found"));
        return optionalUsers.map(CustomUserDetails::new).get();
    }
}
