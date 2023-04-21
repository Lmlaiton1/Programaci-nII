package Modelo;


import java.util.ArrayList;

public class ArrayListLista {
    public ArrayList<String> lista1;

    public ArrayListLista(ArrayList<String> lista1) {
        this.lista1 = lista1;
    }
    

    public ArrayListLista() {
        lista1 = new ArrayList<String>();
    }

    public void agregarElemento(String elemento) {
        lista1.add(elemento);
    }

    public void eliminarElemento(int indice) {
        lista1.remove(indice);
    }

    public String getElemento(int indice) {
        return lista1.get(indice);
    }

    public ArrayList<String> getLista() {
        return lista1;
    }
}
