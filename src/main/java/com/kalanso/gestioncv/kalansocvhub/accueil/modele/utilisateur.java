package com.kalanso.gestioncv.kalansocvhub.accueil.modele;



import jakarta.persistence.Entity;
import lombok.Data;
@Data
@Entity

public class utilisateur {
    private String nom;
    private String mail;
    private String motdepasse;

}
