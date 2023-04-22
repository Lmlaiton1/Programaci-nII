package Controlador;

import Modelo.ArrayG;
import Modelo.ArrayP;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private List<ArrayP> canino = new ArrayList<>(); // lista de perros
    private List<ArrayG> felino = new ArrayList<>(); // lista de gatos

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //obtengo los parametros del jsp
        String tipoMascota = request.getParameter("tipo");
        String nombre = request.getParameter("nombre");
        int edad = Integer.parseInt(request.getParameter("edad"));
        String raza = request.getParameter("raza");
        String color = request.getParameter("color");
        
        //si es perro se agrega nivel de entrenamiento, si es gato toxoplasmosis
        if (tipoMascota.equals("canino")) {
            int nivelE = Integer.parseInt(request.getParameter("nivel-entrenamiento"));
            ArrayP perro = new ArrayP(nivelE, nombre, raza, edad, color);
            canino.add(perro);
        } else {
            boolean enfermedad = Boolean.parseBoolean(request.getParameter("enfermedad"));
            ArrayG gato = new ArrayG(enfermedad, nombre, raza, edad, color);
            felino.add(gato);
        }
        
        //envio al jsp
        request.getSession().setAttribute("ListaP", canino);
        request.getSession().setAttribute("ListaG", felino);
        response.sendRedirect("caljsp.jsp");
    }
    
    public void calcular() {
        // calcular cantidad de perros y gatos
        int cantCaninos = canino.size();
        int cantFelinos = felino.size();
        
        // calcular promedio de edades
        int sumaEdadesCaninos = 0;
        int sumaEdadesFelinos = 0;
        
        for (ArrayP perro : canino) {
            sumaEdadesCaninos += perro.getEdad();
        }
        
        for (ArrayG gato : felino) {
            sumaEdadesFelinos += gato.getEdad();
        }
        
        double promedioEdadesCaninos = sumaEdadesCaninos / (double) cantCaninos;
        double promedioEdadesFelinos = sumaEdadesFelinos / (double) cantFelinos;
        
        // imprimir resultados
        System.out.println("Cantidad de perros: " + cantCaninos);
        System.out.println("Cantidad de gatos: " + cantFelinos);
        System.out.println("Promedio de edades de perros: " + promedioEdadesCaninos);
        System.out.println("Promedio de edades de gatos: " + promedioEdadesFelinos);
    }
    
    public void eliminar(int indice, String tipoMascota) {
        if (tipoMascota.equals("canino")) {
            canino.remove(indice);
        } else {
            felino.remove(indice);
        }
    }
}
