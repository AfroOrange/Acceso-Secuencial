package dad;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ContarPalabras {
    public static void main(String[] args)  {

        String linea = "";
        int contadorPalabras = 0;

        try (BufferedReader reader = new BufferedReader((new FileReader("ficherosTxt/texto_largo.txt")))) {
            while ((linea = reader.readLine()) != null) { // fijarse en la expresión para igualar la línea con el reader

                String[] partes = linea.split("\\s+"); // expresión regular para dividir el texto según espacios en blanco

                contadorPalabras += partes.length;

            }
            System.out.println("Total de palabras = " + contadorPalabras);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}