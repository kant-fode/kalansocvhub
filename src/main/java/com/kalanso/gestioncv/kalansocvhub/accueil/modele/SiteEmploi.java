package com.kalanso.gestioncv.kalansocvhub.accueil.modele;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class SiteEmploi {
    private String titre;
    // sa c'est la classe private je vais creer mais accesseurs pour pouvoir
    // y accedez un peu plus tard
    public String getTitre() {
        return titre;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }
    // sa c'est la classe private je vais creer mais accesseurs pour pouvoir
    // y accedez un peu plus tard pour date publication
    private String datePublication;
    public String getDatePublication() {
        return datePublication;
    }
    public void setDatePublication(String datePublication) {
        this.datePublication = datePublication;
    }
    // sa c'est la classe private je vais creer mais accesseurs pour pouvoir
    // y accedez un peu plus tard pour lieu
    private String lieu;
    public String getLieu() {
        return lieu;
    }
    public void setLieu(String lieu) {
        this.lieu = lieu;
    }
    
}
