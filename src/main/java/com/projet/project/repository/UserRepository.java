package com.projet.project.repository;

import com.projet.project.entities.Facture;
import com.projet.project.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    @Query("select u from Facture e where u.id=:id")
    public List<Facture> FACTURE_LIST(@Param("id") User Id);

}
