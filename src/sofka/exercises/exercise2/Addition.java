package sofka.exercises.exercise2;

/**
 * En esta clase se busca comprobar, que si es posible utilizar mas de un
 * método main en una clase X
 * <p>
 * En este caso se hace uso la sobrecara de métodos, manejando argumentos
 * diferentes en cada uno de los métodos main, para el uso de estos métodos main
 * se debe indicar al programa con cuál de los métodos main se desea trabajar.
 *
 * @author: Rusbell Ruiz Portocarrero - rusbell.ruiz.p@gmail.com
 * @version: 1.0.2 26-05-2023
 * @since: 1.0.0
 */
public class Addition {

    /**
     * Este método permite sumar dos números a, b
     *
     * @param a Primer número a sumar
     * @param b Segundo número a sumar
     * @return Devuelve el resultado de sumar a y b
     * @since: 1.0.0
     */
    public int add(int a, int b) {
        return (a + b);
    }

    /**
     * Este método main permite utilizar el método add recibiendo args como
     * argumento, el cual es de tipo String
     *
     * @param cadena Argumento que se recibe el método main
     * @since: 1.0.0
     */
    public static void main(String cadena) {
        System.out.println("-> Primer caso: Uso de la función main de la clase Addition con " +
                "un argumento tipo String, y su contenido es: " + cadena);
        Addition a = new Addition();
        System.out.println("la suma es :" + a.add(5, 10));
    }

    /**
     * Este método main permite utilizar el método add recibiendo i como
     * argumento, el cual es de tipo int.
     * Se puede notar, que i es un argumento diferente al argumento args
     * utilizado en el otro método main.
     *
     * @param i Argumento que se recibe el método main
     * @since: 1.0.0
     */
    public static void main(int i) {
        System.out.println("\n -> Segundo caso: Uso de la función main de la clase Addition con" +
                " un argumento tipo int y su valor es: " + i);
        Addition b = new Addition();
        System.out.println("la suma es:" + b.add(20, 10));
    }
}
