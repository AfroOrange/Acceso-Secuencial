package dad;

import java.io.*;

public class PromedioNumeros {
    public static void main(String[] args) throws FileNotFoundException {

            double suma = 0;
            int contador = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("ficherosTxt/numeros.txt"))) {
            String linea = "";
            while (linea.equals(String.valueOf(reader.readLine() != null))) {
                contador ++;
                if (contador > 0) {
                    suma = suma /contador;
                    System.out.println(suma);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
