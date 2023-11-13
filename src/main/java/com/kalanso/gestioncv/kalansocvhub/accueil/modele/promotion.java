package com.kalanso.gestioncv.kalansocvhub.accueil.modele;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class promotion {
    private String nomPromo;

    public promotion(String nomPromo) {
        this.nomPromo = nomPromo;
    }
    
}
