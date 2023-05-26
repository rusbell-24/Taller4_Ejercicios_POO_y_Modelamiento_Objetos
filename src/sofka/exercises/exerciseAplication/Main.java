package sofka.exercises.exerciseAplication;

import sofka.exercises.exercise1.Planet;
import sofka.exercises.exercise1.PlanetarySystem;
import sofka.exercises.exercise2.Addition;
import sofka.exercises.exercise3.SortBy;
import sofka.exercises.exercise4.Vehicle;
import sofka.exercises.exercise4.VehicleWarehouse;
import sofka.exercises.exercise4.Ferry;
import sofka.exercises.exercise5.*;
import sofka.exercises.exercise6.ReadNumbers;

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
    static int manned;
    static String dateFormat;
    static String color;
    static String mark;
    static String model;
    static String typeOfFerry;
    static double alongTheFerry;
    static Integer numberOfDishes;
    static Integer numberOfDoors;
    static Integer isConvertible;
    static Integer numberOfEngines;
    static Integer roof;
    static String typeOfBrakes;
    static String ignitionType;
    static Integer numberOfAxes;
    static String typeOfTruck;

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
                    /**
                     * En este caso se podrá crear 10 vehículos de tipo ferry
                     * a partir de una clase vehículo de la cual la clase
                     * ferry hereda. Adicionalmente, los 10 ferry creados se iran
                     * almacenando, lo cual permite poder acceder a
                     * ellos después de haber sido creados
                     */
                    VehicleWarehouse ferryWarehouse = new VehicleWarehouse();
                    do {
                        requestVehicleData(counter);
                        requestFerryData();
                        Ferry newFerry = new Ferry(
                                manned, dateFormat, color,
                                mark, model, typeOfFerry, alongTheFerry);
                        ferryWarehouse.addFerry(newFerry);
                        counter++;

                    } while (counter < 10);
                    System.out.println("\n---LISTADO DE VEHICULOS ALMACENADOS----\n");
                    for (Ferry ferry : ferryWarehouse.getStockFerry()) {
                        System.out.println(
                                "=> Marca: " + ferry.getMark() +
                                        ", Modelo: " + ferry.getModel() +
                                        ", Color: " + ferry.getColor() +
                                        ", Fecha Matri.: " + ferry.getRegistrationDate() +
                                        ", Tripulado: " + ferry.isManned() +
                                        ", Medio: " + ferry.getDisplacementMedium() +
                                        ", Typo: " + ferry.getTypeOfFerry() +
                                        ", Largo: " + ferry.getAlongTheFerry());
                    }
                    break;

                case 5:
                    /**
                     * En este caso se podran crear diferentes tipos de
                     * vehiculos(Bicicletas, Lanchas, Carros, Motocicletas,
                     * Camiones), heredando de la clase vehículo.
                     */
                    VehicleWarehouse vehicleWarehouse = new VehicleWarehouse();
                    Integer numberOfVehicles;
                    System.out.println("Que vehiculo desea construir\n");
                    System.out.println("_______OPCIONES_____");
                    System.out.println("1. Bicicleta");
                    System.out.println("2. Carro");
                    System.out.println("3. Lancha");
                    System.out.println("4. Moto");
                    System.out.println("5. Camion");
                    System.out.println("\nIngrese su opcion: ");
                    secondLevelOptions = userData.nextInt();
                    switch (secondLevelOptions) {
                        case 1:
                            System.out.println(
                                    "Ingrese numero de bicicletas a construir: ");
                            numberOfVehicles = userData.nextInt();
                            do {
                                requestVehicleData(counter);
                                requestBicycleData();
                                Bicycle newBicycle = new Bicycle(
                                        manned, dateFormat, color,
                                        mark, model, numberOfDishes);

                                vehicleWarehouse.addBicycle(newBicycle);
                                counter++;
                            } while (counter < numberOfVehicles);

                            System.out.println("-------LISTADO DE VEHICULOS CONSTRUIDOS------");

                            for (Bicycle bicycle : vehicleWarehouse.getStockBicycle()) {
                                commonImpressionVehicle(bicycle);
                                System.out.print(
                                        ", # de platos: " + bicycle.getNumberOfDishes() + "\n");
                            }

                            break;
                        case 2:
                            System.out.println(
                                    "Ingrese numero de carros a construir: ");
                            numberOfVehicles = userData.nextInt();
                            do {
                                requestVehicleData(counter);
                                requestCarData();
                                Car newCar = new Car(
                                        manned, dateFormat, color,
                                        mark, model, numberOfDoors, isConvertible);

                                vehicleWarehouse.addCar(newCar);
                                counter++;
                            } while (counter < numberOfVehicles);

                            System.out.println("-------LISTADO DE VEHICULOS CONSTRUIDOS------");

                            for (Car car : vehicleWarehouse.getStockCar()) {
                                commonImpressionVehicle(car);
                                System.out.print(
                                        ", # de puertas: " + car.getNumberOfDoors() +
                                                ", Convertible: " + car.isConvertible() + "\n");
                            }

                            break;
                        case 3:
                            System.out.println(
                                    "Ingrese numero de lanchas a construir: ");
                            numberOfVehicles = userData.nextInt();
                            do {
                                requestVehicleData(counter);
                                requestBoatData();
                                Boat newBoat = new Boat(
                                        manned, dateFormat, color,
                                        mark, model, numberOfEngines, roof);

                                vehicleWarehouse.addBoat(newBoat);
                                counter++;
                            } while (counter < numberOfVehicles);

                            System.out.println("-------LISTADO DE VEHICULOS CONSTRUIDOS------");

                            for (Boat boat : vehicleWarehouse.getStockBoat()) {
                                commonImpressionVehicle(boat);
                                System.out.print(
                                        ", # de motores: " + boat.getNumberOfEngines() +
                                                ", Techo: " + boat.isRoof() + "\n");
                            }

                            break;
                        case 4:
                            System.out.println(
                                    "Ingrese numero de motos a construir: ");
                            numberOfVehicles = userData.nextInt();
                            do {
                                requestVehicleData(counter);
                                requestMotorcycleData();
                                Motorcycle newMotorcycle = new Motorcycle(
                                        manned, dateFormat, color,
                                        mark, model, typeOfBrakes, ignitionType);
                                vehicleWarehouse.addMotorcycle(newMotorcycle);
                                counter++;
                            } while (counter < numberOfVehicles);

                            System.out.println("-------LISTADO DE VEHICULOS CONSTRUIDOS------");

                            for (Motorcycle motorcycle : vehicleWarehouse.getStockMotorcycle()) {
                                commonImpressionVehicle(motorcycle);
                                System.out.print(
                                        ", Tipo de frenos: " + motorcycle.getTypeOfBrakes() +
                                                ", Tipo de encendido: " + motorcycle.getIgnitionType() + "\n");
                            }

                            break;
                        case 5:
                            System.out.println(
                                    "Ingrese numero de camiones a construir: ");
                            numberOfVehicles = userData.nextInt();
                            do {
                                requestVehicleData(counter);
                                createTruck();
                                Truck newTruck = new Truck(
                                        manned, dateFormat, color,
                                        mark, model, numberOfAxes, typeOfTruck);
                                vehicleWarehouse.addTruck(newTruck);
                                counter++;
                            } while (counter < numberOfVehicles);

                            System.out.println("-------LISTADO DE VEHICULOS CONSTRUIDOS------");

                            for (Truck truck : vehicleWarehouse.getStockTruck()) {
                                commonImpressionVehicle(truck);
                                System.out.print(
                                        ", Numero de ejes: " + truck.getNumberOfAxes() +
                                                ", Tipo de camión: " + truck.getTypeOfTruck() + "\n");
                            }

                            break;
                    }

                    break;
                case 6:
                    /**
                     * En este caso se podrá llenar en array con n cantidad de
                     * números ingresados por consola.
                     *
                     * El programa deja de recibir números una vez se ingresen
                     * dos números iguales de forma consecutiva
                     */
                    ReadNumbers newReadNumbers = new ReadNumbers();
                    newReadNumbers.read();
                    System.out.println("\n");

                    break;

                case 7:
                    System.out.println("HASTA PRONTO...............");
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
        System.out.println("||        4. Ejercicio4            ||");
        System.out.println("||        5. Ejercicio5            ||");
        System.out.println("||        6. Ejercicio6            ||");
        System.out.println("||        7. Salir                 ||");
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

    /**
     * Este método se encarga de pedir al usuario atributos comunes para todos
     * los tipos de vehículo
     *
     * @since 1.0.0
     */
    private static void requestVehicleData(int counter) {
        System.out.println("Vehiculo #: " + (counter + 1 ) + "...................");
        System.out.println("El vehiculo es tripulado(1=si, 2=no)");
        manned = userData.nextInt();
        System.out.println("Fecha de matricula(dd/mm/aaaa): ");
        dateFormat = userData.next();
        System.out.println("Color del vehiculo: ");
        color = userData.next();
        System.out.println("marca del vehiculo: ");
        mark = userData.next();
        System.out.println("modelo del vehiculo: ");
        model = userData.next();

    }

    /**
     * Este método se encarga de pedir al usuario atributos necesarios para
     * crear un vehículo de tipo Ferry
     *
     * @since 1.0.0
     */
    private static void requestFerryData() {
        System.out.println("Typo de ferry: ");
        typeOfFerry = userData.next();
        System.out.println("Largo del Ferry: ");
        alongTheFerry = userData.nextDouble();
    }

    /**
     * Este método se encarga de pedir al usuario atributos necesarios para
     * crear un vehículo de tipo Bicicleta
     *
     * @since 1.0.0
     */
    private static void requestBicycleData() {
        System.out.println("numero de platos: ");
        numberOfDishes = userData.nextInt();
    }

    /**
     * Este método se encarga de pedir al usuario atributos necesarios para
     * crear un vehículo de tipo Carro
     *
     * @since 1.0.0
     */
    private static void requestCarData() {
        System.out.println("numero de puertas: ");
        numberOfDishes = userData.nextInt();
        System.out.println("es convertible ( 1=Si, 2=No): ");
        isConvertible = userData.nextInt();
    }

    /**
     * Este método se encarga de pedir al usuario atributos necesarios para
     * crear un vehículo de tipo Lancha
     *
     * @since 1.0.0
     */
    private static void requestBoatData() {
        System.out.println("numero de motores: ");
        numberOfEngines = userData.nextInt();
        System.out.println("Tiene techo ( 1=Si, 2=No): ");
        roof = userData.nextInt();
    }

    /**
     * Este método se encarga de pedir al usuario atributos necesarios para
     * crear un vehículo de tipo Motocicleta
     *
     * @since 1.0.0
     */
    private static void requestMotorcycleData() {
        System.out.println("Tipo de frenos: ");
        typeOfBrakes = userData.next();
        System.out.println("Tipo de encendido: ");
        ignitionType = userData.next();
    }

    /**
     * Este método se encarga de pedir al usuario atributos necesarios para
     * crear un vehículo de tipo Camión
     *
     * @since 1.0.0
     */
    private static void createTruck() {
        System.out.print("Numero de ejes: ");
        numberOfAxes = userData.nextInt();
        System.out.println("Tipo de camion: ");
        typeOfTruck = userData.next();
    }

    /**
     * Este método se encarga de imprimir por consola atributos que son
     * comunes en cualquier tipo de vehículo
     *
     * @param vehicle Recibe el vehículo del cual se desean imprimir sus
     *                atributos
     * @since 1.0.0
     */
    private static void commonImpressionVehicle(Vehicle vehicle) {
        System.out.print(
                "=>Marca: " + vehicle.getMark() +
                        ", Modelo: " + vehicle.getModel() +
                        ", Color: " + vehicle.getColor() +
                        ", Fecha Matri.: " + vehicle.getRegistrationDate() +
                        ", Tripulado: " + vehicle.isManned() +
                        ", Medio: " + vehicle.getDisplacementMedium());
    }
}
