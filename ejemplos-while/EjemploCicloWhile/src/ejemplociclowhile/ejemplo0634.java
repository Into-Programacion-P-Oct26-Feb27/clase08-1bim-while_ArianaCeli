import java.util.Locale;
import java.util.Scanner;

public class ejemplo062 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int contador = 1;
        int limite = 5; // Son 5 países y ciudades en la pizarra
        String pais;
        String ciudad;
        String cadenaFinal = "";

        while (contador <= limite) {
            System.out.println("Ingrese el nombre del país:");
            pais = entrada.nextLine();

            System.out.println("Ingrese la ciudad capital:");
            ciudad = entrada.nextLine();

            // Se acumula el número, país y ciudad en la cadena
            cadenaFinal = String.format("%s%d. %s - %s\n", 
                    cadenaFinal, contador, pais, ciudad);

            contador = contador + 1;
        }

        System.out.println("\nListado de países y ciudades:");
        System.out.println(cadenaFinal);
    }
}
