package dad;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SecuencialLeerFrases {
    public static void main (String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("ficherosTxt/frases.txt"))) {
            String linea = "";
            while (linea.equals(String.valueOf(reader.readLine() != null))) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo " + e.getMessage());
        }
    }
}
