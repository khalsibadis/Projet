package com.projet.project.controller;

import com.projet.project.entities.Facture;
import com.projet.project.entities.User;
import com.projet.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/User")
public class UserRestController {
    @Autowired
    UserService userService;

    @GetMapping("/List/{id}")
    @ResponseBody
    public List<Facture> FACTURE_LIST(@PathVariable("id") int Id) {
     return    userService.FACTURE_LIST(Id);
    }

    }
