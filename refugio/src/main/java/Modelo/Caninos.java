package Modelo;

import Modelo.Mascotas;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author milen
 */
public class Caninos extends Mascotas {

    public int getNivelEntre() {
        return nivelEntre;
    }

    public void setNivelEntre(int nivelEntre) {
        this.nivelEntre = nivelEntre;
    }

    int nivelEntre;

//constructor 
    public Caninos(String nombre1, String raza1, String color1, int edad1, int nivelEntrenamiento) {
    }
//costructor sobrecargado

    public Caninos(int nivelEntre, String nombre, String raza, int edad, String color) {
        super(nombre, raza, edad, color);
        this.nivelEntre = nivelEntre;
    }

    
    
}
