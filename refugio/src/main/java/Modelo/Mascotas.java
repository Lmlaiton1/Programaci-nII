/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author milen
 */
public class Mascotas {

    private String nombre;
    private String raza;
    private int edad;
    private String color;
// Método constructor

    public Mascotas() {
    }

// Método constructor sobrecargado
    public Mascotas(String nombre, String raza, int edad, String color) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
