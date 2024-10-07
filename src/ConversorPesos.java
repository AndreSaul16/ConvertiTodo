import java.util.Scanner; // Importa la clase Scanner para leer la entrada del usuario

// Clase que maneja la conversión de unidades de peso
public class ConversorPesos {
    // Método público para convertir unidades de peso
    public void convertirUnidadesDeMedida() {
        Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario
        int opcionPeso; // Variable para almacenar la opción de peso seleccionada por el usuario
        double cantidadPeso; // Variable para almacenar la cantidad de peso a convertir
        double resultadoPeso; // Variable para almacenar el resultado de la conversión

        // Imprime el encabezado del menú de conversión de unidades de peso
        System.out.println("===================================");
        System.out.println("====== Conversión de Unidades De Peso ======");
        System.out.println("===================================");
        System.out.println();
        System.out.println("Has seleccionado el Conversor de Peso."); // Informa al usuario que ha seleccionado el conversor de peso
        System.out.println("Elige la conversión que deseas realizar:"); // Pide al usuario que elija una opción de conversión
        System.out.println();
        // Imprime las opciones de conversión disponibles
        System.out.println("1. Onza (oz) a Gramo (g)");
        System.out.println("2. Gramo (g) a Onza (oz)");
        System.out.println("3. Kilogramo (kg) a Gramo (g)");
        System.out.println("4. Gramo (g) a Kilogramo (kg)");
        System.out.println("5. Libra (lb) a Kilogramo (kg)");
        System.out.println("6. Kilogramo (kg) a Libra (lb)");
        System.out.println("7. Tonelada (t) a Kilogramo (kg)");
        System.out.println("8. Kilogramo (kg) a Tonelada (t)");
        System.out.print("Seleccione una opción: "); // Pide al usuario que seleccione una opción
        opcionPeso = scanner.nextInt(); // Lee la opción seleccionada por el usuario

        System.out.print("Ingrese la cantidad a convertir: "); // Pide al usuario que ingrese la cantidad a convertir
        cantidadPeso = scanner.nextDouble(); // Lee la cantidad de peso a convertir

        resultadoPeso = 0.0; // Inicializa el resultado de la conversión a 0.0
        // Estructura de control para manejar las diferentes opciones de conversión
        switch (opcionPeso) {
            case 1:
                // Convierte de Onza a Gramo usando una tasa de cambio de 1 oz = 28.3495 g
                resultadoPeso = cantidadPeso * 28.3495;
                System.out.println(cantidadPeso + " oz son " + resultadoPeso + " g");
                break;
            case 2:
                // Convierte de Gramo a Onza usando una tasa de cambio de 1 g = 0.035274 oz
                resultadoPeso = cantidadPeso / 28.3495;
                System.out.println(cantidadPeso + " g son " + resultadoPeso + " oz");
                break;
            case 3:
                // Convierte de Kilogramo a Gramo usando una tasa de cambio de 1 kg = 1000 g
                resultadoPeso = cantidadPeso * 1000;
                System.out.println(cantidadPeso + " kg son " + resultadoPeso + " g");
                break;
            case 4:
                // Convierte de Gramo a Kilogramo usando una tasa de cambio de 1 g = 0.001 kg
                resultadoPeso = cantidadPeso / 1000;
                System.out.println(cantidadPeso + " g son " + resultadoPeso + " kg");
                break;
            case 5:
                // Convierte de Libra a Kilogramo usando una tasa de cambio de 1 lb = 0.453592 kg
                resultadoPeso = cantidadPeso * 0.453592;
                System.out.println(cantidadPeso + " lb son " + resultadoPeso + " kg");
                break;
            case 6:
                // Convierte de Kilogramo a Libra usando una tasa de cambio de 1 kg = 2.20462 lb
                resultadoPeso = cantidadPeso / 0.453592;
                System.out.println(cantidadPeso + " kg son " + resultadoPeso + " lb");
                break;
            case 7:
                // Convierte de Tonelada a Kilogramo usando una tasa de cambio de 1 t = 1000 kg
                resultadoPeso = cantidadPeso * 1000;
                System.out.println(cantidadPeso + " t son " + resultadoPeso + " kg");
                break;
            case 8:
                // Convierte de Kilogramo a Tonelada usando una tasa de cambio de 1 kg = 0.001 t
                resultadoPeso = cantidadPeso / 1000;
                System.out.println(cantidadPeso + " kg son " + resultadoPeso + " t");
                break;
            default:
                // Maneja el caso en que la opción seleccionada no es válida
                System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                break;
        }
    }
}