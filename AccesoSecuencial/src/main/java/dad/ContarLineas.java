package dad;

import java.io.*;

public class ContarLineas {
    public static void main(String[] args) throws FileNotFoundException {
        int contador = 0;

        try (BufferedReader reader = new BufferedReader((new FileReader("ficherosTxt/poema.txt")))) {
            while (reader.readLine() != null) {
                contador ++;
            }
            System.out.println("El archivo tiene " + contador + " lineas");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
