/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

/**
 *
 * @author Mark-
 */
public class Tipobf2 extends MetodoPago {
    private int cod_tipobf;
    private String nom_tipobf;

    public Tipobf2() {
    }

    public Tipobf2(String nom_tipobf, String nom_metod) {
        super(nom_metod);
        this.nom_tipobf = nom_tipobf;
    }

    public int getCod_tipobf() {
        return cod_tipobf;
    }

    public void setCod_tipobf(int cod_tipobf) {
        this.cod_tipobf = cod_tipobf;
    }

    public String getNom_tipobf() {
        return nom_tipobf;
    }

    public void setNom_tipobf(String nom_tipobf) {
        this.nom_tipobf = nom_tipobf;
    }
    
    
}
