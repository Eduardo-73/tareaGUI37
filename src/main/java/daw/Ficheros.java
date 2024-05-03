/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.io.FileWriter;
import java.io.IOException;
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

    public static List<String> LeerFichero(String url) {
        List<String> lineas = new ArrayList<>();
        try {
            lineas = Files.readAllLines(Paths.get(url),
                    StandardCharsets.UTF_8);
            lineas.remove(0);
        } catch (IOException ex) {
            System.out.println("Error leyendo el fichero");
        }
        return lineas;
    }

    public static void escribirLista(List<String> lista, String url, String nombre,
            String contraseña) {
        lista.add(nombre + "," + contraseña + "\n");
        try  (FileWriter fila = new FileWriter(url, true)){
            fila.write(lista.get(lista.size() - 1));
        } catch (IOException ioe) {
            System.out.println("Error creando el fichero");
        }
    }
}
