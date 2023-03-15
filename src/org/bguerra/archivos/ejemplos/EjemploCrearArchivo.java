package org.bguerra.archivos.ejemplos;

import org.bguerra.archivos.ejemplos.servicio.ArchivoServicio;

public class EjemploCrearArchivo {
    public static void main(String[] args) {

        String nombreArchivo = "C:\\Cursos\\Java\\archivo\\java.txt";
        ArchivoServicio service = new ArchivoServicio();
        //service.crearArchivo(nombreArchivo);
        service.crearArchivo2(nombreArchivo);
    }
}