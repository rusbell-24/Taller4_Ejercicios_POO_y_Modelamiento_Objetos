package edu.sofka.exerciseapplication;

import edu.sofka.exercise1.Planet;
import edu.sofka.exercise1.PlanetarySystem;
import edu.sofka.exercise3.SortBy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        menu();
    }

    private static void menu() {
        boolean exit = false;
        Integer firstLevelOptions;
        Integer secondLevelOptions;

        Scanner userData = new Scanner(System.in);

        do {
            showMainMenu();
            firstLevelOptions = userData.nextInt();
            switch (firstLevelOptions){
                case 1:
                    double dough;
                    double density;
                    double diameter;
                    double distanceToTheSun;
                    int numberPlanets;
                    int counter = 0;
                    String name;

                    System.out.println("Programa para crear sistema planetario");
                    PlanetarySystem newPlanetarySystem = new PlanetarySystem();
                    System.out.println("numero de planetas: ");
                    numberPlanets = userData.nextInt();
                    do {
                        System.out.println("Ingrese nombre del primer planeta");
                        name = userData.next();
                        System.out.println("Ingrese su masa: ");
                        dough = userData.nextDouble();
                        System.out.println("Ingrese su dencidad: ");
                        density = userData.nextDouble();
                        System.out.println("Ingrese su diametro: ");
                        diameter = userData.nextDouble();
                        System.out.println("Ingrese su distancia al sol: ");
                        distanceToTheSun = userData.nextDouble();
                        Planet newPlanet = new Planet(name, counter, dough, density,diameter,distanceToTheSun);
                        newPlanetarySystem.addPlanet(newPlanet);
                        counter++;
                    }while (counter < numberPlanets);

                    showExerciseOneMenu();
                    secondLevelOptions = userData.nextInt();
                    switch (secondLevelOptions){
                        case 1:
                            for (Planet planet:newPlanetarySystem.getSystem()) {
                                System.out.println(
                                       "Id:" + planet.getId() +
                                         "nombre" + planet.getName() +
                                         "masa" + planet.getDough() +
                                         "dencidad" + planet.getDensity() +
                                        "diametro" + planet.getDiameter()
                                );
                            }
                            break;
                        case 2:
                            int idplanet1;
                            int idplanet2;
                            double distanciaEntreEllos;
                            try {
                                System.out.println("Ingrese id del primer planeta");
                                idplanet1 = userData.nextInt();
                                System.out.println("Ingrese id del segundo planeta");
                                idplanet2 = userData.nextInt();
                                System.out.println("Ingrese la distancia entre ellos");
                                distanciaEntreEllos = userData.nextInt();
                                System.out.println( "la gravedad es: " +
                                        newPlanetarySystem.calculateGravitationalAttraction(
                                                idplanet1,
                                                idplanet2,
                                                distanciaEntreEllos
                                        )
                                );
                            }catch (Exception e){
                                System.out.println("Dato erroneo");
                            }

                            break;
                    }

                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    int quantityNumbers;
                    int orderingMethod;
                    System.out.println("Ingrese la cantidad de numeros a generar: ");
                    quantityNumbers = userData.nextInt();
                    SortBy newArrayOfNumbers= new SortBy(quantityNumbers);
                    System.out.println(Arrays.toString(newArrayOfNumbers.getArrayOfNumbers()));
                    System.out.println("seleccione el metodo de ordenamiento: ");
                    System.out.println("1 Burbuja: ");
                    System.out.println("2. quick sort");
                    System.out.println("Ingrese su opcion: ");
                    orderingMethod = userData.nextInt();
                    switch (orderingMethod){
                        case 1:
                            newArrayOfNumbers.bubbleSort();
                            System.out.println(
                                    Arrays.toString(newArrayOfNumbers.
                                            getArrayOfNumbers()));
                            break;
                        case 2:
                            newArrayOfNumbers.quickSort(
                                    newArrayOfNumbers.getArrayOfNumbers(),
                                    0,
                                    quantityNumbers-1
                            );
                            System.out.println(Arrays.toString(
                                    newArrayOfNumbers.getArrayOfNumbers()));
                            break;
                    }
                    break;
                case 4:
                    System.out.println("4");
                    break;
                case 5:
                    System.out.println("5");
                    break;
                case 6:
                    System.out.println("6");
                    break;
                case 7:
                    exit = true;
                    break;
            }
        }while (!exit);

    }

    private static void showMainMenu() {
        System.out.println("Selecciones ejercicio a ejecutar: ");
        System.out.println("_______OPCIONES:_______");
        System.out.println("1. Ejercicio1");
        System.out.println("2. Ejercicio2");
        System.out.println("3. Ejercicio3");
        System.out.println("4. Ejercicio4");
        System.out.println("5. Ejercicio5");
        System.out.println("6. Ejercicio6");
        System.out.println("7. Salir");
        System.out.println("Ingrese su opcion: ");
    }

    private static void showExerciseOneMenu() {
        System.out.println("_______OPCIONES:_______");
        System.out.println("1. Ver planetas del sistema");
        System.out.println("2. Calcular gravedad entre dos:");
        System.out.println("3. Salir");
        System.out.println("Ingrese su opcion: ");
    }

}
