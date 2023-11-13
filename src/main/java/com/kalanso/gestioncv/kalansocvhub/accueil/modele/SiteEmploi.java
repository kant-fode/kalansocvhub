package com.kalanso.gestioncv.kalansocvhub.accueil.modele;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class SiteEmploi {
    private String titre;
    private String datePublication;
    private String lieu;

    
}
