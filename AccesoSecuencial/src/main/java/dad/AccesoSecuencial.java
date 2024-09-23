package dad;

/*
 * Hello world!
 *
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AccesoSecuencial {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("ficherosTxt/frases.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}