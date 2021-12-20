package com.projet.project.controller;

import com.projet.project.entities.Fournisseur;
import com.projet.project.entities.SuperAdmin;
import com.projet.project.service.FournisseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fournisseur")
public class FournisseurRestController {
    @Autowired
    FournisseurService fournisseurService;

    @PostMapping("/ajouterFacture")
    public void ajouterFacture(@RequestBody Fournisseur fournisseur) {
        fournisseurService.ajouterFacture(fournisseur);
    }


    @PutMapping("/modifierFacture")
    public void modifierFacture(@RequestBody Fournisseur fournisseur) {
        fournisseurService.modifierFacture(fournisseur);
    }

    @DeleteMapping("/supprimerFacture/{id}")
    public void supprimerFacture(@PathVariable("id") Long id) {
        fournisseurService.supprimerFacture(id);
    }

    @GetMapping("/ListeClient")
    public void afficherListe() {
        fournisseurService.afficherListe();
    }
}
