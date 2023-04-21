package Controlador;

import Modelo.ArrayListLista;
import Modelo.Caninos;
import Modelo.Felino;
import Modelo.Mascotas;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListaMascotasServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private ArrayListLista listaMascotas = new ArrayListLista();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ArrayList<Mascotas> mascotas = listaMascotas.getLista();
        request.setAttribute("mascotas", mascotas);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String tipoMascota = request.getParameter("tipo");
        String nombre = request.getParameter("nombre");
        int edad = Integer.parseInt(request.getParameter("edad"));
        String raza = request.getParameter("raza");
        String color = request.getParameter("color");
        
        Mascotas mascota;
        
        if (tipoMascota.equals("canino")) {
            int nivelE = Integer.parseInt(request.getParameter("nivelE"));
            mascota = new Caninos(nivelE, nombre, raza, edad, color);
        } else {
            boolean enfermedad = Boolean.parseBoolean(request.getParameter("enfermedad"));
            mascota = new Felino(enfermedad, nombre, raza, edad, color);
        }

        listaMascotas.agregarElemento(mascota);
        response.sendRedirect("ListaMascotasServlet");
    }
}

    
