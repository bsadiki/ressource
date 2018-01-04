package com.sadiki.badreddine.ressource.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
    private Long societeId;
    public Ressource() {
    }

    public Ressource(String nom, Date dateAchat, double prix, int note, Long societeId) {
        this.nom = nom;
        this.dateAchat = dateAchat;
        this.prix = prix;
        this.note = note;
        this.societeId = societeId;
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

    public Long getSocieteId() {
        return societeId;
    }

    public void setSocieteId(Long societeId) {
        this.societeId = societeId;
    }
}
