package com.example.application.security;

//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//import com.example.application.model.User;
//
//import com.example.application.repository.UserRepository;
//
//@Service
//public class CustomUserDetailsService implements UserDetailsService {
//
//	private final UserRepository userRepository = new UserRepository();
//
//
//
//    @Override
//    public UserDetails loadUserByUsername(String mail) throws UsernameNotFoundException {
//        User user = userRepository.findUserByEmail(mail);
//        List<String> roles = new ArrayList<>();
//        roles.add("USER");
//        UserDetails userDetails =
//                org.springframework.security.core.userdetails.User.builder()
//                        .username(user.getEmail())
//                        .password(user.getPassword())
//                        .roles(roles.toArray(new String[0]))
//                        .build();
//        return userDetails;
//    }
//}