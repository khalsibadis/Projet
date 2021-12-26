package com.projet.project.service;

import com.projet.project.entities.Facture;
import com.projet.project.entities.User;
import com.projet.project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public  List<Facture> FACTURE_LIST(int Id) {
        return userRepository.FACTURE_LIST(Id);
        }
}
