package com.projet.project.controller;

import com.projet.project.entities.Facture;
import com.projet.project.entities.User;
import com.projet.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/User")
public class UserRestController {
    @Autowired
    UserService userService;

    @GetMapping("/List/{id}")
    public List<Facture> FACTURE_LIST(@PathVariable("id") User Id) {
     return    userService.FACTURE_LIST(Id);
    }

    }
