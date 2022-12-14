package io.helioanacronista.servicescontroll.controllers;

import io.helioanacronista.servicescontroll.DTO.UserDTO;
import io.helioanacronista.servicescontroll.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
@CrossOrigin(value = "*")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping(value = "/me", produces ="application/json")
    public ResponseEntity<UserDTO> getMe() {
        UserDTO dto = service.getMe();
        return ResponseEntity.ok(dto);
    }


}
