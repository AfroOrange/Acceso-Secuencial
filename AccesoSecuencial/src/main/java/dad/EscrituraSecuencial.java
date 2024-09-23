package dad;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscrituraSecuencial {
    public static void main(String[] args) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("ficherosTxt/frases.txt", true))) {
            writer.write("Este es un ejemplo de escritura secuencial.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}