package com.project;

import java.io.Serializable;

public class Ciutat implements Serializable{
    private long ciutatId;
    private String nom;
    private String pais;
    private int codiPostal;

    public Ciutat() {}

    public Ciutat(String nom, String pais, int codiPostal){
        this.nom = nom;
        this.pais = pais;
        this.codiPostal = codiPostal;
    }

    public void setCiutatId(long ciutatId) {
        this.ciutatId = ciutatId;
    }

    public long getCiutatId() {
        return ciutatId;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setCodiPostal(int codiPostal) {
        this.codiPostal = codiPostal;
    }

    public int getCodiPostal() {
        return codiPostal;
    }

    @Override
    public String toString() {
        return "Ciutat{" +
                "ciutatId=" + ciutatId +
                ", nom='" + nom + '\'' +
                ", pais='" + pais + '\'' +
                ", codiPostal=" + codiPostal +
                '}';
    }
}
