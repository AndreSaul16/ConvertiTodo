import java.util.Scanner;

public class ConversorTemperaturas {
    public void convertirTemperatura(Scanner scanner) {
        int opcionTemperatura;
        double cantidadTemperatura;
        double resultadoTemperatura;
        boolean finish = false;

        while (!finish) {
            System.out.println("======================================");
            System.out.println("===== Conversión de Temperaturas =====");
            System.out.println("======================================");
            System.out.println();
            System.out.println("Has seleccionado el Conversor de Temperaturas.");
            System.out.println("Elige la conversión que deseas realizar:");
            System.out.println();
            System.out.println("1. Celsius (°C) a Fahrenheit (°F)");
            System.out.println("2. Fahrenheit (°F) a Celsius (°C)");
            System.out.println("3. Celsius (°C) a Kelvin (K)");
            System.out.println("4. Kelvin (K) a Celsius (°C)");
            System.out.println("5. Fahrenheit (°F) a Kelvin (K)");
            System.out.println("6. Kelvin (K) a Fahrenheit (°F)");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcionTemperatura = scanner.nextInt();
            System.out.print("Ingrese la cantidad a convertir: ");
            cantidadTemperatura = scanner.nextDouble();

            switch (opcionTemperatura) {
                case 1:
                    resultadoTemperatura = (cantidadTemperatura * 9 / 5) + 32;
                    System.out.println(cantidadTemperatura + " °C son " + resultadoTemperatura + " °F");
                    break;
                case 2:
                    resultadoTemperatura = (cantidadTemperatura - 32) * 5 / 9;
                    System.out.println(cantidadTemperatura + " °F son " + resultadoTemperatura + " °C");
                    break;
                case 3:
                    resultadoTemperatura = cantidadTemperatura + 273.15;
                    System.out.println(cantidadTemperatura + " °C son " + resultadoTemperatura + " K");
                    break;
                case 4:
                    resultadoTemperatura = cantidadTemperatura - 273.15;
                    System.out.println(cantidadTemperatura + " K son " + resultadoTemperatura + " °C");
                    break;
                case 5:
                    resultadoTemperatura = (cantidadTemperatura + 459.67) * 5 / 9;
                    System.out.println(cantidadTemperatura + " ° F son " + resultadoTemperatura + " K");
                    break;
                case 6:
                    resultadoTemperatura = (cantidadTemperatura * 9 / 5) - 459.67;
                    System.out.println(cantidadTemperatura + " K son " + resultadoTemperatura + " °F");
                    break;
                case 7:
                    finish = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
