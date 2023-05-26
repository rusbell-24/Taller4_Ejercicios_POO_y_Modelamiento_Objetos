package sofka.exercises.exerciseAplication;

import sofka.exercises.exercise1.Planet;
import sofka.exercises.exercise1.PlanetarySystem;
import sofka.exercises.exercise2.Addition;
import sofka.exercises.exercise3.SortBy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * En la clase Main se construye toda la interfaz con la que el usuario va a
 * interactuar con alguno de los 6 ejercicios, también se construye aquí la
 * parte trasera del sistema donde se indica que acción se tomara cuando el
 * usuario solicite una determinada función.
 * <p>
 * ej: Interfaz de consola que permite al Usuario seleccionar X,Y y Z funciones:
 * Si Usuario selecciona funcion X {
 * Por favor sistema invoca la clase W y su metodo X }
 * Si Usuario selecciona funcion Y {
 * Por favor sistema invoca la clase Q y su metodo Y }
 * Etc...
 *
 * @version 1.0.2 01-05-2022
 * @author: Rusbell Ruiz Portocarrero - rusbell.ruiz.p@gmail.com
 * @since 1.0.0
 */
public class Main {
    static String nameSystem;
    static double dough;
    static double density;
    static double diameter;
    static double distanceToTheSun;
    static int numberPlanets;
    static String name;
    static Scanner userData = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        boolean exit = false;
        Integer firstLevelOptions;
        Integer secondLevelOptions;
        int counter = 0;

        /**
         * Se utiliza un Do para crear el ciclo de interfaz grafica para el
         * Usuario e ingresar al primer menu o menu principal
         */
        do {
            showMainMenu();
            firstLevelOptions = userData.nextInt();
            switch (firstLevelOptions) {
                case 1:
                    /**
                     * En este caso se podrá crear un sistema planetario,
                     * a partir de la creación de n cantidad de planetas
                     */
                    System.out.println(
                            "\n----------Programa para crear un sistema planetario---------------\n");
                    System.out.println("\nIngrese el nombre del sistema planetario:");
                    nameSystem = userData.next();
                    PlanetarySystem newPlanetarySystem = new PlanetarySystem(nameSystem);
                    System.out.println("numero de planetas del sistema: ");
                    numberPlanets = userData.nextInt();
                    do {
                        System.out.println("Ingrese nombre del " + (counter + 1) +" planeta: ");
                        name = userData.next();
                        System.out.println("Ingrese su masa: ");
                        dough = userData.nextDouble();
                        System.out.println("Ingrese su dencidad: ");
                        density = userData.nextDouble();
                        System.out.println("Ingrese su diametro: ");
                        diameter = userData.nextDouble();
                        System.out.println("Ingrese su distancia al sol: ");
                        distanceToTheSun = userData.nextDouble();
                        Planet newPlanet = new Planet(
                                name, counter, dough,
                                density, diameter, distanceToTheSun);

                        newPlanetarySystem.addPlanet(newPlanet);
                        counter++;
                    } while (counter < numberPlanets);

                    showExerciseOneMenu();
                    secondLevelOptions = userData.nextInt();
                    switch (secondLevelOptions) {
                        case 1:
                            System.out.println("" +
                                    "\nSystema planetario: " +
                                    newPlanetarySystem.getName() + "\n"
                            );
                            for (Planet planet : newPlanetarySystem.getSystem()) {
                                System.out.println(
                                        "-> Id: " + planet.getId() +
                                        " nombre: " + planet.getName() +
                                        " masa: " + planet.getDough() +
                                        " dencidad: " + planet.getDensity() +
                                        " diametro: " + planet.getDiameter()
                                );
                            }
                            break;
                        case 2:
                            int idplanet1;
                            int idplanet2;
                            double distancePlanets;
                            for (Planet planet : newPlanetarySystem.getSystem()) {
                                System.out.println(
                                        "-> Id: " + planet.getId() +
                                                " nombre: " + planet.getName() +
                                                " masa: " + planet.getDough() +
                                                " dencidad: " + planet.getDensity() +
                                                " diametro: " + planet.getDiameter()
                                );
                            }



                            try {
                                System.out.println(
                                        "Ingrese id del primer planeta");
                                idplanet1 = userData.nextInt();
                                System.out.println(
                                        "Ingrese id del segundo planeta");
                                idplanet2 = userData.nextInt();
                                System.out.println(
                                        "Ingrese la distancia entre ellos");
                                distancePlanets = userData.nextDouble();
                                double gravitationalPull =
                                        newPlanetarySystem.calculateGravitationalAttraction(
                                        idplanet1,
                                        idplanet2,
                                        distancePlanets);
                                System.out.println(
                                        "la gravedad es: " + gravitationalPull + "cN");
                                                ;
                            } catch (Exception e) {
                                System.out.println("Dato erroneo");
                            }

                            break;
                    }
                    break;

                case 2:
                    /**
                     * En este caso se podrá comprobar la utilización de
                     * multiples métodos main en un mismo programa
                     *
                     * Se puede notar que para utilizar dos main, se puede hacer
                     * uso de la sobrecarga de métodos, pasando diferentes
                     * argumentos como parámetro, de esta manera se le indica al
                     * programa que método main se quiero utilizar, si el que
                     * tiene como argumento un string o el que tiene como
                     * argumento un int
                     */
                    Addition.main("SOY CADENA");
                    Addition.main(1000);
                    break;

                case 3:
                    /**
                     * En este caso se podrá generar n cantidad de números y
                     * almacenarlos en un array para posteriormente poderlo
                     * ordenar bien sea por el método de ordenamiento burbuja o
                     * quicksort
                     */
                    int quantityNumbers;
                    int orderingMethod;
                    System.out.println(
                            "Ingrese la cantidad de numeros a generar: ");
                    quantityNumbers = userData.nextInt();
                    SortBy newArrayOfNumbers = new SortBy(quantityNumbers);
                    System.out.println( "Numeros Generados: " +
                            Arrays.toString(
                                    newArrayOfNumbers.getArrayOfNumbers()));
                    System.out.println(
                            "\nseleccione el metodo de ordenamiento: ");
                    System.out.println("    1 Burbuja: ");
                    System.out.println("    2. quick sort");
                    System.out.println("Ingrese su opcion: ");
                    orderingMethod = userData.nextInt();
                    switch (orderingMethod) {
                        case 1:
                            newArrayOfNumbers.bubbleSort();
                            System.out.println( "Numeros Ordenados(Burbuja): " +
                                    Arrays.toString(newArrayOfNumbers.getArrayOfNumbers()));
                            break;
                        case 2:
                            newArrayOfNumbers.quickSort(
                                    newArrayOfNumbers.getArrayOfNumbers(),
                                    0,
                                    quantityNumbers - 1);
                            System.out.println( "Numeros Ordenados(Quicksort): " +
                                    Arrays.toString(
                                    newArrayOfNumbers.getArrayOfNumbers()));
                            break;
                    }
                    break;

                case 4:
                    exit = true;
                    break;
            }
        } while (!exit);

    }

    /**
     * Este método se encarga de mostrar el menu principal de la interfaz de
     * usuario
     *
     * @since 1.0.0
     */
    private static void showMainMenu() {
        System.out.println("\nSelecciones ejercicio a ejecutar: ");
        System.out.println(" \n _____________OPCIONES:_____________");
        System.out.println("| --------------------------------- |");
        System.out.println("||        1. Ejercicio1            ||");
        System.out.println("||        2. Ejercicio2            ||");
        System.out.println("||        3. Ejercicio3            ||");
        System.out.println("||        4. Salir                 ||");
        System.out.println("|___________________________________|");
        System.out.println("|  Ingrese su opcion:               |");
        System.out.println("|___________________________________|");
    }

    /**
     * Este método muestra una interfaz de usuario en el caso de que se
     * seleccione la opción 1 del menu principal
     *
     * @since 1.0.0
     */
    private static void showExerciseOneMenu() {
        System.out.println(" \n _____________OPCIONES:_______________");
        System.out.println("| ----------------------------------- |");
        System.out.println("||  1. Ver planetas del sistema      ||");
        System.out.println("||  2. Calcular gravedad entre dos:  ||");
        System.out.println("||  3. Salir                         ||");
        System.out.println("|_____________________________________|");
        System.out.println("|  Ingrese su opcion:                 |");
        System.out.println("|_____________________________________|");
    }

}
