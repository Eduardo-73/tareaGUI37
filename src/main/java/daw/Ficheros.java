/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author edu
 */
public class Ficheros {

    public static List<POJO> leerFichero(String url) {
        List<String> lineas = new ArrayList<>();
        List<POJO> lista = new ArrayList<>();
        try {
            lineas = Files.readAllLines(Paths.get(url),
                    StandardCharsets.UTF_8);
            lineas.remove(0);
            lista = pasarFicheroAClase(lineas);
        } catch (IOException ex) {
            System.out.println("Error leyendo el fichero");
        }
        return lista;
    }

    private static List<POJO> pasarFicheroAClase(List<String> fichero) {
        List<POJO> lista = new ArrayList<>();
        for (String linea : fichero) {
            String[] split = linea.split(",");
            if (split.length == 2) {
                lista.add(new POJO(split[0], split[1]));
            } else {
                System.out.println("Error: La línea no tiene el formato esperado: ");
            }
        }
        return lista;
    }

    public static void escribirLista(String url, String nombre,
            String contraseña) {
        List<String> fichero = new ArrayList<>();
        fichero.add(nombre + "," + contraseña + "\n");
        try (FileWriter fila = new FileWriter(url, true)) {
            fila.write(fichero.get(fichero.size() - 1));
        } catch (IOException ioe) {
            System.out.println("Error creando el fichero");
        }
    }
}
