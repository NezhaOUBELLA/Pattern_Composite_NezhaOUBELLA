package org.example;

public abstract class Composant {
    protected String nom;
    protected int level;
    public Composant(String nom) {

        this.nom = nom;

    }
    public abstract void operation();
}
