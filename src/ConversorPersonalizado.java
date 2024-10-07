import java.util.Scanner; // Importa la clase Scanner para leer la entrada del usuario

// Clase que maneja la conversión personalizada
public class ConversorPersonalizado {
    // Método público para realizar una conversión personalizada
    public void convertirPersonalizado() {
        Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario
        double tasaConversion; // Variable para almacenar la tasa de conversión personalizada
        double cantidad; // Variable para almacenar la cantidad a convertir
        double resultado; // Variable para almacenar el resultado de la conversión

        // Pide al usuario que ingrese la tasa de conversión personalizada
        System.out.print("Ingrese la tasa de conversión personalizada: ");
        tasaConversion = scanner.nextDouble(); // Lee la tasa de conversión ingresada por el usuario

        // Pide al usuario que ingrese la cantidad a convertir
        System.out.print("Ingrese la cantidad a convertir: ");
        cantidad = scanner.nextDouble(); // Lee la cantidad a convertir

        // Realiza la conversión usando la tasa personalizada
        resultado = cantidad * tasaConversion;
        // Muestra el resultado de la conversión
        System.out.println(cantidad + " unidades a la tasa de " + tasaConversion + " son " + resultado + " unidades convertidas.");
    }
}