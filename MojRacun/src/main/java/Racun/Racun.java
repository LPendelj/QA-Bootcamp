package Racun;

import Transakcije.Transakcija;

import java.util.ArrayList;

public class Racun {
    private static int broj = 1;
    private int idRacuna;
    private double stanjeNaRacunu;
    private ArrayList<Transakcija> transakcije;

    public Racun(String idRacuna, double stanjeNaRacunu, ArrayList<Transakcija> transakcije) {
        this.idRacuna = getBroj();
        this.stanjeNaRacunu = stanjeNaRacunu;
        this.transakcije = new ArrayList<Transakcija>();
        broj+=1;
    }

    public Racun() {
        stanjeNaRacunu = 0;
        this.idRacuna = getBroj();
        this.transakcije = new ArrayList<Transakcija>();
        broj+=1;
    }

    public static int getBroj() {
        return broj;
    }

    public static void setBroj(int broj) {
        Racun.broj = broj;
    }

    public int getIdRacuna() {
        return idRacuna;
    }

    public void setIdRacuna(int idRacuna) {
        this.idRacuna = idRacuna;
    }

    public double getStanjeNaRacunu() {
        return stanjeNaRacunu;
    }

    public void setStanjeNaRacunu(double stanjeNaRacunu) {
        this.stanjeNaRacunu = stanjeNaRacunu;
    }

    public ArrayList<Transakcija> getTransakcije() {
        return transakcije;
    }


