import java.util.Scanner;

// Clase que maneja la conversión de divisas
public class ConversorDivisas {
    private double tasaEuroDolar = 1.18;
    private double tasaDolarEuro = 0.85;
    private double tasaEuroYen = 129.0;
    private double tasaYenEuro = 0.0078;
    private double tasaEuroLibra = 0.73;
    private double tasaLibraEuro = 1.37;

    // Método público para convertir divisas
    public void convertirDivisas(Scanner scanner) {
        int opcionDivisa;
        double cantidad;
        double resultado;

        // Imprime el menú de conversión de divisas
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

        // Estructura de control para manejar las diferentes opciones de conversión
        resultado = 0.0;
        switch (opcionDivisa) {
            case 1:
                resultado = cantidad * tasaEuroDolar;
                System.out.println(cantidad + " EUR son " + resultado + " USD");
                break;
            case 2:
                resultado = cantidad * tasaDolarEuro;
                System.out.println(cantidad + " USD son " + resultado + " EUR");
                break;
            case 3:
                resultado = cantidad * tasaEuroYen;
                System.out.println(cantidad + " EUR son " + resultado + " JPY");
                break;
            case 4:
                resultado = cantidad * tasaYenEuro;
                System.out.println(cantidad + " JPY son " + resultado + " EUR");
                break;
            case 5:
                resultado = cantidad * tasaEuroLibra;
                System.out.println(cantidad + " EUR son " + resultado + " GBP");
                break;
            case 6:
                resultado = cantidad * tasaLibraEuro;
                System.out.println(cantidad + " GBP son " + resultado + " EUR");
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    // Método público para actualizar las tasas de cambio de divisas
    public void actualizarTasasDeCambio(Scanner scanner) {
        System.out.print("Ingrese la nueva tasa de Euro a Dólar: ");
        tasaEuroDolar = scanner.nextDouble();
        System.out.print("Ingrese la nueva tasa de Dólar a Euro: ");
        tasaDolarEuro = scanner.nextDouble();
        System.out.print("Ingrese la nueva tasa de Euro a Yen: ");
        tasaEuroYen = scanner.nextDouble();
        System.out.print("Ingrese la nueva tasa de Yen a Euro: ");
        tasaYenEuro = scanner.nextDouble();
        System.out.print("Ingrese la nueva tasa de Euro a Libra: ");
        tasaEuroLibra = scanner.nextDouble();
        System.out.print("Ingrese la nueva tasa de Libra a Euro: ");
        tasaLibraEuro = scanner.nextDouble();
        System.out.println("Tasas de cambio actualizadas.");
    }
}