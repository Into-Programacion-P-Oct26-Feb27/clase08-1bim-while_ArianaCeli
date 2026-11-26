
import java.util.Locale;
import java.util.Scanner;

public class ejemplo062 {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        boolean bandera = true;
        String pais;
        String ciudad;
        String cadenaFinal = "";
        int salir;

        while (bandera == true) {
            System.out.println("Ingrese el nombre del país:");
            pais = entrada.nextLine();

            System.out.println("Ingrese la ciudad capital:");
            ciudad = entrada.nextLine();

            // Se acumula el país y la ciudad en la cadena
            cadenaFinal = String.format("%s%s - %s\n", cadenaFinal, pais, ciudad);

            System.out.println("Si desea salir del ciclo, ingrese -100 (o cualquier otro número para continuar):");
            salir = entrada.nextInt();
            entrada.nextLine(); // Limpiar el buffer después de leer un entero

            if (salir == -100) {
                bandera = false;
            }
        }

        System.out.println("\nListado de países y ciudades:");
        System.out.println(cadenaFinal);
    }
}
