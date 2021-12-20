package com.projet.project.service;

import com.projet.project.entities.SuperAdmin;
import com.projet.project.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService{
    @Autowired
    AdminRepository adminRepository;

    @Override
    public void addFournisseur(SuperAdmin Admin) {
        adminRepository.save(Admin);
    }

    @Override
    public void supprimerFournisseur(Long id) {
    adminRepository.deleteById(id);
    }

    @Override
    public void updateFrounisseur(SuperAdmin admin) {
    adminRepository.save(admin);
    }

    @Override
    public void afficherListe() {
        adminRepository.findAll();
    }


}
