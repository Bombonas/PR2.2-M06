package com.project;


import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "Ciutada2")
public class Ciutada2 implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)// Generación automática de clave primaria
    @Column(name = "ciutadaid", unique = true, nullable = false)
    private long id;

    @Column(name = "ciutat_id")
    private long ciutatId;

    @Column(name = "nom")
    private String nom;

    @Column(name = "cognom")
    private String cognom;

    @Column(name = "edat")
    private int edat;

    public Ciutada2() {
    }

    public Ciutada2(long ciutatId, String nom, String cognom, int edat) {
        this.ciutatId = ciutatId;
        this.nom = nom;
        this.cognom = cognom;
        this.edat = edat;
    }

    public void setCiutadaId(long id) {
        this.id = id;
    }

    public long getCiutadaId() {
        return id;
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

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public int getEdat() {
        return edat;
    }

    @Override
    public String toString() {
        return "Ciutada{" +
                "id=" + id +
                ", ciutatId=" + ciutatId +
                ", nom='" + nom + '\'' +
                ", cognom='" + cognom + '\'' +
                ", edat=" + edat +
                '}';
    }
}
