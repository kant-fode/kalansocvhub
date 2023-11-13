package com.kalanso.gestioncv.kalansocvhub.accueil.modele;



import jakarta.persistence.Entity;
import lombok.Data;
@Data
@Entity

public class utilisateur {
    private String nom;
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    private String mail;
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    private String motdepasse;
    public String getMotdepasse() {
        return motdepasse;
    }
    public void setMotdepasse(String motdepasse) {
        this.motdepasse = motdepasse;
    }
    
}
