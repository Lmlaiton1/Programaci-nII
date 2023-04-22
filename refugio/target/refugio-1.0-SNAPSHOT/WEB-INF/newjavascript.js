/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */
function mostrarCampos() {
    var tipo = document.getElementById("tipo").value;
    var entrenamiento = document.getElementById("entrenamiento");
    var toxoplasmosis = document.getElementById("toxoplasmosis");

    if (tipo == "Canino") {
        entrenamiento.style.display = "block";
        toxoplasmosis.style.display = "none";
    } else if (tipo == "Felino") {
        entrenamiento.style.display = "none";
        toxoplasmosis.style.display = "block";
    } else {
        entrenamiento.style.display = "none";
        toxoplasmosis.style.display = "none";
    }
}


	