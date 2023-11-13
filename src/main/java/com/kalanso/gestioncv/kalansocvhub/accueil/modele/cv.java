package com.kalanso.gestioncv.kalansocvhub.accueil.modele;

import org.springframework.boot.autoconfigure.SpringBootApplication;


import jakarta.persistence.Entity;
import lombok.Data;

@SpringBootApplication
@Entity
@Data


public class cv {
    private String nom;
    
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    private String prenom;
 
    
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    private String etude;
    public String getEtude() {
        return etude;
    }
    private String experience;
    public String getExperience(){
        return experience;
    }
    public void setExperience(String experience){
        this.experience = experience;
    }
}
