package com.projet.project.service;

import com.projet.project.entities.Fournisseur;
import com.projet.project.repository.FournisseurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FounisseurServiceImpl implements FournisseurService {
    @Autowired
    FournisseurRepository fournisseurRepository;

    @Override
    public void ajouterFacture(Fournisseur fournisseur) {
        fournisseurRepository.save(fournisseur);
    }

    @Override
    public void modifierFacture(Fournisseur fournisseur) {
        fournisseurRepository.save(fournisseur);
    }

    @Override
    public void supprimerFacture(Long id) {
        fournisseurRepository.deleteById(id);
    }

    @Override
    public void afficherListe() {
        fournisseurRepository.findAll();
    }
}
