package sofka.exercises.exercise4;

import sofka.exercises.exercise5.*;

import java.util.ArrayList;

/**
 * Esta clase permite almacenar vehículos de un mismo tipo en un array de
 * ese tipo, el número de vehículos que se puedan guardar es dinámico.
 *
 * @author: Rusbell Ruiz Portocarrero - rusbell.ruiz.p@gmail.com
 * @version: 1.0.0 26-05-2023
 * @since: 1.0.0
 */
public class VehicleWarehouse {

    /**
     * Array donde se almacenan vehículos de tipo ferry
     */
    private ArrayList<Ferry> stockFerry = new ArrayList<>();

    /**
     * Array donde se almacenan vehículos de tipo carro
     */
    private ArrayList<Car> stockCar = new ArrayList<>();

    /**
     * Array donde se almacenan vehículos de tipo moto
     */
    private ArrayList<Motorcycle> stockMotorcycle = new ArrayList<>();

    /**
     * Array donde se almacenan vehículos de tipo bicicleta
     */
    private ArrayList<Bicycle> stockBicycle = new ArrayList<>();

    /**
     * Array donde se almacenan vehículos de tipo lancha
     */
    private ArrayList<Boat> stockBoat = new ArrayList<>();

    /**
     * Array donde se almacenan vehículos de tipo camión
     */
    private ArrayList<Truck> stockTruck = new ArrayList<>();

    /**
     * Este método permite ir almacenando vehículos de tipo ferry
     *
     * @param ferry Ferry que se desea almacenar en el array
     * @since: 1.0.0
     */
    public void addFerry(Ferry ferry) {
        this.stockFerry.add(ferry);
    }

    /**
     * Método que permite obtener el almacén de ferry
     *
     * @return Devuelve el almacén de ferry
     * @since: 1.0.0
     */
    public ArrayList<Ferry> getStockFerry() {
        return stockFerry;
    }

    /**
     * Este método permite ir almacenando vehículos de tipo carro
     *
     * @param car Carro que se desea almacenar en el almacén de ferry
     * @since: 1.0.0
     */
    public void addCar(Car car) {
        this.stockCar.add(car);
    }

    /**
     * Método que permite obtener el almacén de carros
     *
     * @return Devuelve el almacén de carros
     * @since: 1.0.0
     */
    public ArrayList<Car> getStockCar() {
        return stockCar;
    }

    /**
     * Este método permite ir almacenando vehículos de tipo moto
     *
     * @param motorcycle Moto que se desea almacenar en el almacén de motos
     * @since: 1.0.0
     */
    public void addMotorcycle(Motorcycle motorcycle) {
        this.stockMotorcycle.add(motorcycle);
    }

    /**
     * Método que permite obtener el almacén de motos
     *
     * @return Devuelve el almacén  de motos
     * @since: 1.0.0
     */
    public ArrayList<Motorcycle> getStockMotorcycle() {
        return stockMotorcycle;
    }

    /**
     * Este método permite ir almacenando vehículos de tipo bicicleta
     *
     * @param bicycle Bicicleta que se desea almacenar en el almacén de
     *                bicicletas
     * @since: 1.0.0
     */
    public void addBicycle(Bicycle bicycle) {
        this.stockBicycle.add(bicycle);
    }

    /**
     * Método que permite obtener el almacén de bicicletas
     *
     * @return Devuelve el almacén de bicicletas
     * @since: 1.0.0
     */
    public ArrayList<Bicycle> getStockBicycle() {
        return stockBicycle;
    }

    /**
     * Este método permite ir almacenando vehículos de tipo lancha
     *
     * @param boat Lancha que se desea almacenar en el almacén de lanchas
     * @since: 1.0.0
     */
    public void addBoat(Boat boat) {
        this.stockBoat.add(boat);
    }

    /**
     * Método que permite obtener el almacén de lanchas
     *
     * @return Devuelve el almacén de lanchas
     * @since: 1.0.0
     */
    public ArrayList<Boat> getStockBoat() {
        return stockBoat;
    }

    /**
     * Este método permite ir almacenando vehículos de tipo camión
     *
     * @param truck Camión que se desea almacenar en el almacén de camiones
     * @since: 1.0.0
     */
    public void addTruck(Truck truck) {
        this.stockTruck.add(truck);
    }

    /**
     * Método que permite obtener el almacén de camiones
     *
     * @return Devuelve el almacén de camiones
     * @since: 1.0.0
     */
    public ArrayList<Truck> getStockTruck() {
        return stockTruck;
    }

}

