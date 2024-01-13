package com.project;

import java.io.Serializable;

public class Ciutada implements Serializable{
    private long id;
	private long ciutatId;
	private String nom;
	private String cognom;
	private int edat;

    public Ciutada() {
    }

    public Ciutada(long ciutatId, String nom, String cognom, int edat) {
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
