package com.example.restfulwebservice.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class UserJpaController {

    private final UserRepository userRepository;

}
