package promedio;

import java.util.Scanner;

/**
 *
 * @author damian
 */
public class Promedio {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float nota, promedio = 0;
        int cant, cont = 1;

        System.out.println("Cuantas notas tenes? ");
        cant = in.nextInt();

        do {
            System.out.println("Dame la nota ");
            nota = in.nextFloat();

            if (nota >= 1 && nota <= 10) {
                promedio = promedio + nota;

                cont++;

            } else {
                System.out.println("La nota tiene que ser entre 1 y 10");
            }

        } while (cont > 0 && cont <= cant);

        promedio = promedio / 4;

        if (promedio >= 6) {
            System.out.println("Aprobaste con: " + promedio + " promedio");
        } else
            
            System.out.println("Desaprobaste con: " + promedio + " promedio");

    }

}
