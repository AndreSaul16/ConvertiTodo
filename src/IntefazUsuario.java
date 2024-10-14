import java.util.Scanner;

public class IntefazUsuario {
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        ConversorDivisas conversorDivisas = new ConversorDivisas();
        ConversorPesos conversorPesos = new ConversorPesos();
        LimpiarConsola limpiarConsola = new LimpiarConsola();

        do {
            System.out.println("====================================");
            System.out.println("     MENÚ DE CONVERSIÓN");
            System.out.println("====================================");
            System.out.println("Bienvenido al Conversor Multifuncional");
            System.out.println("Por favor, elige una opción:");
            System.out.println("1. Convertir Divisas");
            System.out.println("2. Convertir Medidas de Distancia");
            System.out.println("3. Convertir Unidades de Peso");
            System.out.println("4. Actualizar Tasas de Cambio de Divisas");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();


            switch (opcion) {
                case 1:
                    conversorDivisas.convertirDivisas(scanner);
                    break;
                case 2:
                    //conversorDistancias(scanner);
                    break;
                case 3:
                    conversorPesos.convertirUnidadesDeMedida();
                    break;
                case 4:
                    conversorDivisas.actualizarTasasDeCambio(scanner);
                    break;
                case 5:
                    limpiarConsola.limpiar();
                    break;
                case 6:
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