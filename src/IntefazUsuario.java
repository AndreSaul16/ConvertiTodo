import java.util.Scanner;

public class IntefazUsuario {
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        ConversorDivisas conversorDivisas = new ConversorDivisas();
        ConversorDistancias conversorDistancias = new ConversorDistancias();
        ConversorPesos conversorPesos = new ConversorPesos();
        LimpiarConsola limpiarConsola = new LimpiarConsola();
        ConversorTemperaturas temperaturas = new ConversorTemperaturas();
        ConversorPerzonalizado customizable = new ConversorPerzonalizado();

        do {
            System.out.println("====================================");
            System.out.println("     MENÚ DE CONVERSIÓN");
            System.out.println("====================================");
            System.out.println("Bienvenido al Conversor Multifuncional");
            System.out.println("Por favor, elige una opción:");
            System.out.println("1. Convertir Divisas");
            System.out.println("2. Convertir Medidas de Distancia");
            System.out.println("3. Convertir Unidades de Peso");
            System.out.println("4. Convertir Temperaturas");
            System.out.println("5. Actualizar Tasas de Cambio de Divisas");
            System.out.println("6. Conversor Personalizado");
            System.out.println("7. Limpiar consola");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();


            switch (opcion) {
                case 1:
                    conversorDivisas.convertirDivisas(scanner);
                    break;
                case 2:
                    conversorDistancias.convertirDistancia(scanner);
                    break;
                case 3:
                    conversorPesos.convertirUnidadesDePesos();
                    break;
                case 4:
                    temperaturas.convertirTemperatura(scanner);
                case 5:
                    conversorDivisas.actualizarTasasDeCambio(scanner);
                    break;
                case 6:
                    customizable.customizableConversor(scanner);
                    break;
                case 7:
                    limpiarConsola.limpiar();
                case 8:
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