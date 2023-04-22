package Modelo;

import Modelo.Mascotas;
import java.util.List;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author milen
 */
public class ArrayP extends Mascotas {

    private int nivelEntre;
    private List<ArrayP> ArrayP;

    public List<ArrayP> getArrayP() {
        return ArrayP;
    }

    public int getNivelEntre() {
        return nivelEntre;
    }

    public void setNivelEntre(int nivelEntre) {
        this.nivelEntre = nivelEntre;
    }

//constructor 
    public ArrayP() {
    }

//costructor sobrecargado
    public ArrayP(int nivelEntre, String nombre, String raza, int edad, String color) {
        super(nombre, raza, edad, color);
        this.nivelEntre = nivelEntre;
    }

}
