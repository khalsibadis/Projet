package com.projet.project.controller;

import com.projet.project.entities.Fournisseur;
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
    public void addFournisseur(@RequestBody Fournisseur fournisseur) {
        adminService.addFournisseur(fournisseur);
    }

    @DeleteMapping("/delete/{id}")
    public void supprimerFournisseur(@PathVariable("id") Long id) {
        adminService.supprimerFournisseur(id);
    }

    @PutMapping("/update")
    public void updateFrounisseur(@RequestBody Fournisseur fournisseur) {
        adminService.updateFrounisseur(fournisseur);
    }

    @GetMapping("/Liste")
    @ResponseBody
    public void afficherListe() {
        adminService.afficherListe();
    }


}
