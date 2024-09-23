package dad;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SecuencialEscribirFrases {
    public static void main(String[] args) {
        String[] nombres = {"Pepe", "Julián", "Marcelo"};

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("ficherosTxt/nombres.txt"))) {
            for (String nombre : nombres) {
                writer.write(nombre);
                writer.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
