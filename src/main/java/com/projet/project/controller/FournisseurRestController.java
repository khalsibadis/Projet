package com.projet.project.controller;

import com.projet.project.entities.Facture;
import com.projet.project.entities.Fournisseur;
import com.projet.project.entities.SuperAdmin;
import com.projet.project.service.FournisseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fournisseur")
public class FournisseurRestController {
    @Autowired
    FournisseurService fournisseurService;

    @PostMapping("/ajouterFacture")
    @ResponseBody
    public void ajouterFacture(@RequestBody Facture facture) {
        fournisseurService.ajouterFacture(facture);
    }


    @PutMapping("/modifierFacture")
    public void modifierFacture(@RequestBody Facture facture ) {
        fournisseurService.modifierFacture(facture);
    }

    @DeleteMapping("/supprimerFacture/{id}")
    public void supprimerFacture(@PathVariable("id") Long id) {
        fournisseurService.supprimerFacture(id);
    }



@GetMapping("/AfficherList")
@ResponseBody
    public List<Facture> factures(Facture facture) {
       return fournisseurService.factures(facture);
    }

    }
