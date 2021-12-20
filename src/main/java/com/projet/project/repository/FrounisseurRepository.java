package com.projet.project.repository;

import com.projet.project.entities.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FrounisseurRepository  extends JpaRepository<Fournisseur,Long> {
}
