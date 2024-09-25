package filtrar.agrupar;

import java.io.*;
import java.util.ArrayList;

public class FiltrarAgrupar {
    public static void main(String[] args) throws IOException {

        // Primero hay que crear un directorio porque si no, el Writer no creará los archivos TxT

        File nuevoDirectorio = new File("ficherosCreados");
        if (!nuevoDirectorio.exists()) {
            if (nuevoDirectorio.mkdirs()) {
                System.out.println("Directorio 'ficherosCreados' se creó");
            } else {
                System.out.println("El directorio ya existe");
                return;
            }
        }

        // Después de crear el directorio, abrir el Reader para el archivo TxT original

        try (BufferedReader reader = new BufferedReader(new FileReader("ficherosTxt/productos.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                ArrayList<String> idProducto = new ArrayList<>();
                ArrayList<String> nombreProducto = new ArrayList<>();
                ArrayList<String> precioProducto = new ArrayList<>();
                ArrayList<String> tipoProducto = new ArrayList<>();

                String[] partes = linea.split(","); // Dividirlos por las "comas" del propio texto

                idProducto.add(partes[0]);          // Almacena idProductos
                nombreProducto.add(partes[1]);      // Almacena nombreProductos
                precioProducto.add(partes[2]);      // Almacena precioProductos
                tipoProducto.add(partes[3]);        // Almacena tiposProductos

                // Tras esto, escribiremos cada una de las categorías en sus respectivos txt
                try (BufferedWriter writer = new BufferedWriter(new FileWriter("ficherosCreados/idProductos.txt", true))) {
                    writer.write(String.valueOf(idProducto));
                }
                try (BufferedWriter writer = new BufferedWriter(new FileWriter("ficherosCreados/nombreProductos.txt", true))) {
                    writer.write(String.valueOf(nombreProducto));
                }
                try (BufferedWriter writer = new BufferedWriter(new FileWriter("ficherosCreados/precioProductos.txt", true))) {
                    writer.write(String.valueOf(precioProducto));
                }
                try (BufferedWriter writer = new BufferedWriter(new FileWriter("ficherosCreados/tipoProductos.txt", true))) {
                    writer.write(String.valueOf(tipoProducto));
                }
                    catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
