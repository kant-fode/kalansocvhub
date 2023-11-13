package com.kalanso.gestioncv.kalansocvhub.accueil.modele;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class apprenant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idApp;
    private String nom;
    // public String getNom(){
    //     return nom;
    // }
    private String prenom;
    private String mail;
    private String motdepasse;
    
}
