package com.projet.project.repository;

import com.projet.project.entities.SuperAdmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<SuperAdmin,Long> {
}
