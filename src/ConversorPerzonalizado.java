import java.util.Scanner;

public class ConversorPerzonalizado {
    // Método público para convertir divisas
    public void customizableConversor(Scanner scanner) {
        String descripcion;
        double cantidad;
        double tasa;
        double resultado;

        // Imprime el menú de conversión de divisas
        System.out.println("=====================================");
        System.out.println("====== Conversor Personalizado ======");
        System.out.println("=====================================");
        System.out.println();
        System.out.println("Has seleccionado el Conversor personalizable.");
        System.out.println("Ingrese la descripción de la conversión (por ejemplo, 'Kilómetros a Millas'): ");
        System.out.println();
        descripcion = scanner.nextLine();
        System.out.println();
        System.out.println("Muy bien, ingresa la tasa de conversión (por ejemplo, 1 Km = 0.621371 Millas):");
        tasa = scanner.nextDouble();
        System.out.println();
        System.out.print("Ingrese la cantidad a convertir: ");
        cantidad = scanner.nextDouble();


        resultado = cantidad * tasa;
        System.out.println(cantidad + " " + descripcion.split(" a ")[0] + " son "
                + resultado + " " + descripcion.split(" a ")[1]);
        scanner.close();


    }
}