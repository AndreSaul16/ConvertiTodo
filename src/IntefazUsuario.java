import java.util.Scanner;
import ConversorDivisas;

public class IntefazUsuario {
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        do {
            System.out.println("====================================");
            System.out.println("     MENÚ DE CONVERSIÓN");
            System.out.println("====================================");
            System.out.println("Bienvenido al Conversor Multifuncional");
            System.out.println("Por favor, elige una opción:");
            System.out.println("1. Convertir Divisas");
            System.out.println("2. Convertir Medidas de Distancia");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    ConversorDivisas conversor = new ConversorDivisas();
                    conversor.convertirDivisas(scanner);
                    break;
                case 2:
                    //convertirDistancia(scanner);
                    break;
                case 3:
                    continuar = false;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (continuar);

        scanner.close();
    }
}
