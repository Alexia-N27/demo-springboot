package fr.epsi.b3.demo.service;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class BavardService {

    private String nom = "Krznaric";

    public BavardService() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String parler() {
        return "Nom : " + nom + ", Classe : " + this.getClass().getSimpleName();
    }

    @PostConstruct
    private void postConstruct() {
        System.out.println("PostConstruct : " + nom + ", Classe : " + this.getClass().getSimpleName());
    }
}
