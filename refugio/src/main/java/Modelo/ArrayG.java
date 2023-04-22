/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Modelo.Mascotas;
import java.util.List;

/**
 *
 * @author milen
 */
public class ArrayG extends Mascotas {

    boolean toxoplasmosis;
    List<ArrayG> ArrayG;

    public List<ArrayG> getArrayG() {
        return ArrayG;
    }

    public void setArrayG(List<ArrayG> ArrayG) {
        this.ArrayG = ArrayG;
    }

//constructor 
    public ArrayG() {
    }
//constructor sobrecargado

    public ArrayG(boolean toxoplasmosis, String nombre, String raza, int edad, String color) {
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

