package com.mycompany.bluraystore.entity;

public class Movie {
    private String title;
    private long numberExemple;
    private String genre;
    private String acteur;

    public Movie() {
    }

    public Movie(String title, long numberExemple, String genre, String acteur) {
        this.title = title;
        this.numberExemple = numberExemple;
        this.genre = genre;
        this.acteur = acteur;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getNumberExemple() {
        return numberExemple;
    }

    public void setNumberExemple(long numberExemple) {
        this.numberExemple = numberExemple;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getActeur() {
        return acteur;
    }

    public void setActeur(String acteur) {
        this.acteur = acteur;
    }

    @Override
    public String toString() {
        return "title = " + title + " ; " +
                "numberExemple = " + numberExemple + " ; "+
                "genre = " + genre + " ; " +
                "acteur = " + acteur + " ; ";
    }
}
