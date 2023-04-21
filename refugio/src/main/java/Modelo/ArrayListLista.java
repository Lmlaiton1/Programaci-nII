package Modelo;

import java.util.ArrayList;

public class ArrayListLista {
    public ArrayList<Mascotas> lista;

    public ArrayListLista(ArrayList<Mascotas> lista) {
        this.lista = lista;
    }
    
    public ArrayListLista() {
        lista = new ArrayList<Mascotas>();
    }

    public void agregarElemento(Mascotas elemento) {
        lista.add(elemento);
    }

    public void eliminarElemento(int indice) {
        lista.remove(indice);
    }

    public Mascotas getElemento(int indice) {
        return lista.get(indice);
    }

    public ArrayList<Mascotas> getLista() {
        return lista;
    }
}

