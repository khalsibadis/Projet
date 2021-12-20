package com.projet.project.controller;

import com.projet.project.entities.SuperAdmin;
import com.projet.project.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminRestController {
    @Autowired
    AdminService adminService;

    @PostMapping("/ajout")
    public void addFournisseur (@RequestBody SuperAdmin Admin){
        adminService.addFournisseur(Admin);
    }

    @DeleteMapping("/delete/{id}")
    public void supprimerFournisseur(@PathVariable("id") Long id){
        adminService.supprimerFournisseur(id);
    }
    @PutMapping("/update")
    public void updateFrounisseur(@RequestBody SuperAdmin admin) {
        adminService.updateFrounisseur(admin);
    }

    @GetMapping("/Liste")
    public void afficherListe(){
        adminService.afficherListe();
    }



    }
