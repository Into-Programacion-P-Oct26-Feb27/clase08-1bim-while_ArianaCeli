/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplociclowhile;

/**
 *
 * @author SALASC
 */
public class ejemplo062 {
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
