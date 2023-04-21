/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Modelo.Mascotas;

/**
 *
 * @author milen
 */
public class Felino extends Mascotas {

    boolean toxoplasmosis;

//constructor 
    public Felino() {
    }
//constructor sobrecargado

    public Felino(boolean toxoplasmosis, String nombre, String raza, int edad, String color) {
        super(nombre, raza, edad, color);
        this.toxoplasmosis = toxoplasmosis;
    }

    public boolean isToxoplasmosis() {
        return toxoplasmosis;
    }

    public void setToxoplasmosis(boolean toxoplasmosis) {
        this.toxoplasmosis = toxoplasmosis;
    }

}
