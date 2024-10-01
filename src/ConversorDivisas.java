import java.util.Scanner;

public class ConversorDivisas {
    private void convertirDivisas(Scanner scanner) {
        int opcionDivisa;
        double cantidad;
        double resultado;

        System.out.println("===================================");
        System.out.println("====== Conversión de Divisas ======");
        System.out.println("===================================");
        System.out.println();
        System.out.println("Has seleccionado el Conversor de Divisas.");
        System.out.println("Elige la conversión que deseas realizar:");
        System.out.println();
        System.out.println("1. Euro a Dólar");
        System.out.println("2. Dólar a Euro");
        System.out.println("3. Euro a Yen");
        System.out.println("4. Yen a Euro");
        System.out.println("5. Euro a Libra");
        System.out.println("6. Libra a Euro");
        System.out.print("Seleccione una opción: ");
        opcionDivisa = scanner.nextInt();

        System.out.print("Ingrese la cantidad a convertir: ");
        cantidad = scanner.nextDouble();

        resultado = 0.0;
        switch (opcionDivisa) {
            case 1:
                resultado = cantidad * 0.85; // Supongamos una tasa de cambio de 1 USD = 0.85 EUR
                System.out.println(cantidad + " USD son " + resultado + " EUR");
                break;
            case 2:
                resultado = cantidad * 1.18; // Supongamos una tasa de cambio de 1 EUR = 1.18 USD
                System.out.println(cantidad + " EUR son " + resultado + " USD");
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
}
