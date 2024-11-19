import java.util.Scanner;

public class ConversorDistancias {
    public void convertirDistancia(Scanner scanner) {
        // Declaración de variables
        int opcionDistancia;
        double cantidadDistancia;
        double resultadoDistancia;
        boolean finish = false;

        while (!finish) {
            // Imprime el menú de conversión de distancias
            System.out.println("===================================");
            System.out.println("====== Conversión de Distancias ======");
            System.out.println("===================================");
            System.out.println();
            System.out.println("Has seleccionado el Conversor de Distancias.");
            System.out.println("Elige la conversión que deseas realizar:");
            System.out.println();
            System.out.println("1. Metro (m) a Kilómetro (km)");
            System.out.println("2. Kilómetro (km) a Metro (m)");
            System.out.println("3. Pulgada (in) a Centímetro (cm)");
            System.out.println("4. Centímetro (cm) a Pulgada (in)");
            System.out.println("5. Pie (ft) a Metro (m)");
            System.out.println("6. Metro (m) a Pie (ft)");
            System.out.println("7. Yarda (yd) a Metro (m)");
            System.out.println("8. Metro (m) a Yarda (yd)");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opción: ");
            opcionDistancia = scanner.nextInt();
            System.out.print("Ingrese la cantidad a convertir: ");
            cantidadDistancia = scanner.nextDouble();

            // Estructura de control para manejar las diferentes opciones de conversión
            switch (opcionDistancia) {
                case 1:
                    resultadoDistancia = cantidadDistancia / 1000;
                    System.out.println(cantidadDistancia + " m son " + resultadoDistancia + " km");
                    break;
                case 2:
                    resultadoDistancia = cantidadDistancia * 1000;
                    System.out.println(cantidadDistancia + " km son " + resultadoDistancia + " m");
                    break;
                case 3:
                    resultadoDistancia = cantidadDistancia * 2.54;
                    System.out.println(cantidadDistancia + " in son " + resultadoDistancia + " cm");
                    break;
                case 4:
                    resultadoDistancia = cantidadDistancia / 2.54;
                    System.out.println(cantidadDistancia + " cm son " + resultadoDistancia + " in");
                    break;
                case 5:
                    resultadoDistancia = cantidadDistancia * 0.3048;
                    System.out.println(cantidadDistancia + " ft son " + resultadoDistancia + " m");
                    break;
                case 6:
                    resultadoDistancia = cantidadDistancia / 0.3048;
                    System.out.println(cantidadDistancia + " m son " + resultadoDistancia + " ft");
                    break;
                case 7:
                    resultadoDistancia = cantidadDistancia * 0.9144;
                    System.out.println(cantidadDistancia + " yd son " + resultadoDistancia + " m");
                    break;
                case 8:
                    resultadoDistancia = cantidadDistancia / 0.9144;
                    System.out.println(cantidadDistancia + " m son " + resultadoDistancia + " yd");
                    break;
                case 9:
                    finish = true;
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }
}
