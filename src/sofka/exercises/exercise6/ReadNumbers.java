package sofka.exercises.exercise6;

import java.util.Scanner;
import java.util.Vector;

/**
 * Esta clase permite ingresar n cantidad de números y almacenarlos en un
 * vector, el programa deja de recibir números en el momento en que se
 * ingresan dos números iguales de forma consecutiva
 *
 * @author: Rusbell Ruiz Portocarrero - rusbell.ruiz.p@gmail.com
 * @version: 1.0.0 26-05-2023
 * @since: 1.0.0
 */
public class ReadNumbers {

    /**
     * Este objeto permitirá obtener los datos ingresados por consola
     */
    Scanner userData = new Scanner(System.in);

    /**
     * Array donde se guardaran los numeros que ingrese el usuario por consola
     */
    Vector<Integer> numbersVector = new Vector<>();

    /**
     * Variable que controla la terminación del ciclo de recibir números.
     */
    boolean exit2 = false;

    /**
     * Este método se encarga de recibir los números e irlos añadiendo al
     * vector, hasta que se repita un numero de forma consecutiva.
     *
     * @since: 1.0.0
     */
    public void read() {
        do {
            System.out.println("Ingrese numero: ");
            numbersVector.addElement(userData.nextInt());
            if (numbersVector.size() > 1) {
                if (numbersVector.get(numbersVector.size() - 1).equals(
                        numbersVector.get(numbersVector.size() - 2))) {
                    exit2 = true;
                }
            }
        } while (!exit2);

        System.out.println("\nNumeros Ingresados: ");
        for (int i = 0; i < numbersVector.size(); i++) {
            System.out.print(numbersVector.get(i) + " ");
        }
    }

    /**
     * Este método permite obtener el vector con los números ingresados
     *
     * @return Devuelve el vector con los números ingresados.
     * @since: 1.0.0
     */
    public Vector<Integer> getNumbersVector() {
        return numbersVector;
    }
}
