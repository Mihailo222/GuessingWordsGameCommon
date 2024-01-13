/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Acer
 */
public class Slovo implements Serializable{
    private char slovo;
    private int pozicija;

    public Slovo() {
    }

    public Slovo(char slovo, int pozicija) {
        this.slovo = slovo;
        this.pozicija = pozicija;
    }

    public char getSlovo() {
        return slovo;
    }

    public void setSlovo(char slovo) {
        this.slovo = slovo;
    }

    public int getPozicija() {
        return pozicija;
    }

    public void setPozicija(int pozicija) {
        this.pozicija = pozicija;
    }

    @Override
    public String toString() {
        return "Slovo{" + "slovo=" + slovo + ", pozicija=" + pozicija + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Slovo other = (Slovo) obj;
        if (this.slovo != other.slovo) {
            return false;
        }
        return this.pozicija == other.pozicija;
    }
    
    
    
}
