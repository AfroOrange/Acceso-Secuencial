package dad;

import java.io.RandomAccessFile;
import java.io.IOException;

public class AccesoAleatorio {
    public static void main(String[] args) {

        try (RandomAccessFile file = new RandomAccessFile("archivo.bin", "rw")) {
            // Escribir en posiciones específicas
            file.seek(0); // Posición inicial
            file.writeInt(100); // Escribe un entero en la posición 0
            file.seek(4); // Posicionarse después del entero
            file.writeDouble(8.25); // Escribir un double

            // Leer desde posiciones específicas
            file.seek(0); // Regresar al inicio
            int numero = file.readInt();
            double decimal = file.readDouble();
            System.out.println("Entero leído: " + numero);
            System.out.println("Double leído: " + decimal);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}