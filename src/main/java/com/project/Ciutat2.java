package com.project;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "Ciutat2")
public class Ciutat2 implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ciutatid", unique = true, nullable = false)
    private long ciutatId;

    @Column(name="nom")
    private String nom;

    @Column(name="pais")
    private String pais;

    @Column(name = "codi_postal")
    private int codiPostal;

    public Ciutat2() {}

    public Ciutat2(String nom, String pais, int codiPostal){
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
