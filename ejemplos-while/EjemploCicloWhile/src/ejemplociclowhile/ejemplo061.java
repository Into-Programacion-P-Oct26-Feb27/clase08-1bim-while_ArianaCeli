package ejemplociclowhile;

import java.util.Locale;
import java.util.Scanner;

public class ejemplo061 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        boolean bandera = true;

        while (bandera == true) { // true == true // false == true
            System.out.println("Estoy en el ciclo"); // Estoy en el ciclo

            int salir;
            System.out.println("Desea salir del ciclo, ingrese -100.");
            salir = entrada.nextInt(); // 100 // -100
            if (salir == -100) { // -100 == -100
                bandera = false;
            }
        }

    }
}
/*
por el ciclo while por una variable (bandera) para repetir una acción hasta que el usuario decida detenerla
*/