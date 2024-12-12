import java.util.Scanner; // Importa la clase Scanner para leer la entrada del usuario
import java.util.HashMap;

// Clase que maneja la conversión de divisas
public class ConversorDivisas {
    private HashMap<String, Double> tasas = new HashMap<>();

    // Constructor para inicializar las tasas estándar
    public ConversorDivisas() {
        tasas.put("EUR-USD", 1.18);
        tasas.put("USD-EUR", 0.85);
        tasas.put("EUR-JPY", 129.0);
        tasas.put("JPY-EUR", 0.0078);
        tasas.put("EUR-GBP", 0.73);
        tasas.put("GBP-EUR", 1.37);
    }

    // Método público para convertir divisas
    public void convertirDivisas(Scanner scanner) {
        String clave;
        double cantidad;
        double resultado;
        boolean finish = false;

        while (!finish) {
            // Imprime el menú de conversión de divisas
            System.out.println("===================================");
            System.out.println("====== Conversión de Divisas ======");
            System.out.println("===================================");
            System.out.println();
            System.out.println("Has seleccionado el Conversor de Divisas.");
            System.out.println("Elige una opción:");
            System.out.println("1. Realizar una conversión");
            System.out.println("2. Ver conversiones disponibles");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la clave de conversión (formato: DIVISA1-DIVISA2): ");
                    clave = scanner.next();

                    if (!tasas.containsKey(clave)) {
                        System.out.println("No se encontró la tasa para la clave ingresada. Intente nuevamente.");
                        continue;
                    }

                    System.out.print("Ingrese la cantidad a convertir: ");
                    cantidad = scanner.nextDouble();

                    // Realiza la conversión
                    resultado = cantidad * tasas.get(clave);
                    System.out.println(cantidad + " en " + clave.split("-")[0] + " son " + resultado + " en " + clave.split("-")[1]);
                    break;

                case 2:
                    System.out.println("Conversiones disponibles:");
                    for (String conversion : tasas.keySet()) {
                        System.out.println("- " + conversion + " (Tasa: " + tasas.get(conversion) + ")");
                    }
                    break;

                case 3:
                    finish = true;
                    System.out.println("Saliendo del conversor de divisas.");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }

    // Método público para actualizar las tasas de cambio de divisas
    public void actualizarTasasDeCambio(Scanner scanner) {
        String clave;
        double nuevaTasa;
        boolean finBucle = false;

        while (!finBucle) {
            // Imprime el menú de actualización de divisas
            System.out.println("=============================================");
            System.out.println("========= Actualizar o Añadir Tasas =========");
            System.out.println("=============================================");
            System.out.println();
            System.out.println("Has seleccionado el actualizador de tasas.");
            System.out.println("Puedes actualizar una tasa existente o añadir una nueva divisa.");
            System.out.println("Nota: Solo se permiten conversiones con USD como base.");
            System.out.println("Formato: DIVISA1-USD (ejemplo: EUR-USD)");
            System.out.println("Escribe 'SALIR' para finalizar.");
            System.out.print("Ingrese la clave de la tasa a actualizar o añadir: ");
            clave = scanner.next();

            if (clave.equalsIgnoreCase("SALIR")) {
                finBucle = true;
                System.out.println("Tasas de cambio actualizadas.");
                continue;
            }

            // Verifica que la clave siga el formato adecuado
            if (!clave.endsWith("-USD")) {
                System.out.println("Error: Solo se permiten tasas con USD como divisa base. Intente nuevamente.");
                continue;
            }

            System.out.print("Ingrese la nueva tasa para " + clave + ": ");
            nuevaTasa = scanner.nextDouble();

            // Añade o actualiza la tasa directa
            tasas.put(clave, nuevaTasa);

            // Calcula e inserta automáticamente la tasa inversa
            String divisaOrigen = clave.split("-")[0];
            String claveInversa = "USD-" + divisaOrigen;
            tasas.put(claveInversa, 1 / nuevaTasa);

            System.out.println((tasas.containsKey(clave) ? "Tasa actualizada: " : "Nueva tasa añadida: ") + clave + " -> " + nuevaTasa);
            System.out.println("Tasa inversa añadida: " + claveInversa + " -> " + (1 / nuevaTasa));
        }
    }
}
