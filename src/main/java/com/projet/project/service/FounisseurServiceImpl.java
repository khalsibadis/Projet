package com.projet.project.service;

import com.projet.project.entities.Facture;
import com.projet.project.entities.Fournisseur;
import com.projet.project.repository.FactureRepository;
import com.projet.project.repository.FournisseurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FounisseurServiceImpl implements FournisseurService {
    @Autowired
    FactureRepository factureRepository;

    @Override
    public void ajouterFacture(Facture facture) {
        factureRepository.save(facture);
    }

    @Override
    public void modifierFacture(Facture facture) {
        factureRepository.save(facture);
    }

    @Override
    public void supprimerFacture(Long id) {
        factureRepository.deleteById(id);
    }

    @Override
    public void afficherListe() {
        factureRepository.findAll();
    }
}
