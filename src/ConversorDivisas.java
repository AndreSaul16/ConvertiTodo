import java.util.Scanner; // Importa la clase Scanner para leer la entrada del usuario

public class ConversorDivisas {
    // Método público para convertir divisas
    public void convertirDivisas(Scanner scanner) {
        int opcionDivisa; // Variable para almacenar la opción de divisa seleccionada por el usuario
        double cantidad; // Variable para almacenar la cantidad de dinero a convertir
        double resultado; // Variable para almacenar el resultado de la conversión

        // Imprime el encabezado del menú de conversión de divisas
        System.out.println("===================================");
        System.out.println("====== Conversión de Divisas ======");
        System.out.println("===================================");
        System.out.println();
        System.out.println("Has seleccionado el Conversor de Divisas.");
        System.out.println("Elige la conversión que deseas realizar:");
        System.out.println();
        // Imprime las opciones de conversión disponibles
        System.out.println("1. Euro a Dólar");
        System.out.println("2. Dólar a Euro");
        System.out.println("3. Euro a Yen");
        System.out.println("4. Yen a Euro");
        System.out.println("5. Euro a Libra");
        System.out.println("6. Libra a Euro");
        System.out.print("Seleccione una opción: ");
        opcionDivisa = scanner.nextInt(); // Lee la opción seleccionada por el usuario

        System.out.print("Ingrese la cantidad a convertir: ");
        cantidad = scanner.nextDouble(); // Lee la cantidad de dinero a convertir

        resultado = 0.0; // Inicializa el resultado de la conversión a 0.0
        // Estructura de control para manejar las diferentes opciones de conversión
        switch (opcionDivisa) {
            case 1:
                // Convierte de USD a EUR usando una tasa de cambio de 1 USD = 0.85 EUR
                resultado = cantidad * 0.85;
                System.out.println(cantidad + " USD son " + resultado + " EUR");
                break;
            case 2:
                // Convierte de EUR a USD usando una tasa de cambio de 1 EUR = 1.18 USD
                resultado = cantidad * 1.18;
                System.out.println(cantidad + " EUR son " + resultado + " USD");
                break;
            case 3:
                // Convierte de EUR a JPY usando una tasa de cambio de 1 EUR = 129 JPY
                resultado = cantidad * 129.0;
                System.out.println(cantidad + " EUR son " + resultado + " JPY");
                break;
            case 4:
                // Convierte de JPY a EUR usando una tasa de cambio de 1 JPY = 0.0078 EUR
                resultado = cantidad * 0.0078;
                System.out.println(cantidad + " JPY son " + resultado + " EUR");
                break;
            case 5:
                // Convierte de EUR a GBP usando una tasa de cambio de 1 EUR = 0.73 GBP
                resultado = cantidad * 0.73;
                System.out.println(cantidad + " EUR son " + resultado + " GBP");
                break;
            case 6:
                // Convierte de GBP a EUR usando una tasa de cambio de 1 GBP = 1.37 EUR
                resultado = cantidad * 1.37;
                System.out.println(cantidad + " GBP son " + resultado + " EUR");
                break;
            default:
                // Maneja el caso en que la opción seleccionada no es válida
                System.out.println("Opción no válida.");
        }
    }
}