<%-- 
    Document   : Jsp
    Created on : 20/04/2023, 4:16:04 p. m.
    Author     : milen
--%>


<%@page import="Controlador.ListaMascotasServlet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.Caninos"%>
<%@page import="Modelo.Felino"%>
<%@page import="Modelo.Mascotas"%>
<%@page import="Modelo.ArrayListLista"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Lista de Mascotas</title>
</head>
<body>
    <h1>Lista de Mascotas</h1>
    <form action="agregarMascota" method="POST">
        <label for="tipo">Tipo:</label>
        <select name="tipo" id="tipo">
            <option value="canino">Canino</option>
            <option value="felino">Felino</option>
        </select><br>
        <label for="nombre">Nombre:</label>
        <input type="text" name="nombre" id="nombre"><br>
        <label for="raza">Raza:</label>
        <input type="text" name="raza" id="raza"><br>
        <label for="color">Color:</label>
        <input type="text" name="color" id="color"><br>
        <label for="edad">Edad:</label>
        <input type="number" name="edad" id="edad"><br>
        <div id="atributoAdicionalDiv"></div>
        <button type="submit">Agregar mascota</button>
    </form>
    <br>
    <table border="1">
        <tr>
            <th>Tipo</th>
            <th>Nombre</th>
            <th>Raza</th>
            <th>Color</th>
            <th>Edad</th>
            <th>Atributo adicional</th>
            <th>Acciones</th>
        </tr>
        <% ArrayListLista
           for (Mascotas mascota : mascotas) { %>
        <tr>
            <% if (mascota instanceof Caninos) { %>
            <td>Canino</td>
            <td><%= mascota.getNombre() %></td>
            <td><%= mascota.getRaza() %></td>
            <td><%= mascota.getColor() %></td>
            <td><%= mascota.getEdad() %></td>
            <td><%= ((Caninos) mascota).getNivelEntre() %></td>
            <% } else if (mascota instanceof Felino) { %>
            <td>Felino</td>
            <td><%= mascota.getNombre() %></td>
            <td><%= mascota.getRaza() %></td>
            <td><%= mascota.getColor() %></td>
            <td><%= mascota.getEdad() %></td>
            <td><%= ((Felino) mascota).isToxoplasmosis  () %></td>
            <% } %>
            <td>
                <form action="eliminarMascota" method="POST">
                    <input type="hidden" name="nombre" value="<%= mascota.getNombre() %>">
                    <button type="submit">Eliminar</button> 
                            <% } %>
            </td>
            <td>
                <form action="eliminarMascota" method="POST">
                    <input type="hidden" name="nombre" value="<%= mascotas.getNombre() %>">
                    <button type="submit">Eliminar</button>
                </form>
            </td>
        </tr>
        <% } %>
    </table>
</body>
</html>


