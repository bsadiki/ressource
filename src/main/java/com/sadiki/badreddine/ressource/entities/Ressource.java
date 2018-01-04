package com.sadiki.badreddine.ressource.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Ressource implements Serializable{
    @Id @GeneratedValue
    private Long numero;
    private String nom;
    private Date dateAchat;
    private double prix;
    private int note;
    @ManyToOne
    @JoinColumn(name="num_Entreprise")
    private Entreprise entreprise;
    public Ressource() {
    }

    public Ressource(String nom, Date dateAchat, double prix, int note, Entreprise entreprise) {
        this.nom = nom;
        this.dateAchat = dateAchat;
        this.prix = prix;
        this.note = note;
        this.entreprise = entreprise;
    }

    public Long getNumero() {

        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(Date dateAchat) {
        this.dateAchat = dateAchat;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public Entreprise getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(Entreprise entreprise) {
        this.entreprise = entreprise;
    }
}
