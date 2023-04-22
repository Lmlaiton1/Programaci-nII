<%-- 
    Document   : caljsp
    Created on : 20/04/2023, 4:16:04 p. m.
    Author     : milen
--%>

<%@page import="Modelo.ArrayG"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.ArrayP"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Resultados</title>
</head>
<body>
    <h1>REGISTRO DE MASCOTAS</h1>
    <%
        List<ArrayP> canino = (List<ArrayP>) request.getSession().getAttribute("ListaP");
        List<ArrayG> felino = (List<ArrayG>) request.getSession().getAttribute("ListaG");
        int cantCaninos = canino.size();
        int cantFelinos = felino.size();
        
        int sumaEdadesCaninos = 0;
        int sumaEdadesFelinos = 0;
        double promedioEdadesCaninos = 0.0;
        double promedioEdadesFelinos = 0.0;
        
        if (cantCaninos > 0) {
            for (ArrayP perro : canino) {
                sumaEdadesCaninos += perro.getEdad();
            }
            promedioEdadesCaninos = sumaEdadesCaninos / (double) cantCaninos;
        }
        
        if (cantFelinos > 0) {
            for (ArrayG gato : felino) {
                sumaEdadesFelinos += gato.getEdad();
            }
            promedioEdadesFelinos = sumaEdadesFelinos / (double) cantFelinos;
        }
    %>
    <p>Cantidad de perros: <%= cantCaninos %></p>
    <p>Cantidad de gatos: <%= cantFelinos %></p>
    <p>Promedio de edades de perros: <%= promedioEdadesCaninos %></p>
    <p>Promedio de edades de gatos: <%= promedioEdadesFelinos %></p>
</body>
</html>

