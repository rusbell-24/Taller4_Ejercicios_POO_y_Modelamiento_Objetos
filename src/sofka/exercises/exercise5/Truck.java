package sofka.exercises.exercise5;

import sofka.exercises.exercise4.Vehicle;

/**
 * Esta clase hereda de la clase vehículo y permite construir un vehículo de
 * tipo camión con algunos atributos que diferencian a un camión de otro
 * tipo de vehículo
 *
 * @author: Rusbell Ruiz Portocarrero - rusbell.ruiz.p@gmail.com
 * @version: 1.0.0 26-05-2023
 * @since: 1.0.0
 */
public class Truck extends Vehicle {

    /**
     * Esta variable representa el numero  de ejes que tiene el camión
     */
    private Integer numberOfAxes;

    /**
     * Esta variable corresponde al tipo de camión
     */
    private String typeOfTruck;

    /**
     * Método constructor que para crear un camión exige los
     * siguientes parámetros:
     *
     * @param manned       Tripulado o no
     * @param dateFormat   Fecha de matricula del camión
     * @param color        Color del camión
     * @param mark         Marca del camión
     * @param model        Modelo del camión
     * @param numberOfAxes Número de ejes del camión
     * @param typeOfTruck  Tipo de camión
     * @since: 1.0.0
     */
    public Truck(
            int manned,
            String dateFormat,
            String color,
            String mark,
            String model,
            Integer numberOfAxes,
            String typeOfTruck
    ) {
        super(manned, dateFormat, "Tierra", color, mark, model);
        this.numberOfAxes = numberOfAxes;
        this.typeOfTruck = typeOfTruck;
    }

    /**
     * Este método permite obtener el número de ejes que tiene el camión
     *
     * @return Devuelve el número de ejes del camión
     * @since: 1.0.0
     */
    public Integer getNumberOfAxes() {
        return numberOfAxes;
    }

    /**
     * Este método permite obtener información sobre el tipo de camión que es
     *
     * @return Devuelve e tipo de camión
     * @since: 1.0.0
     */
    public String getTypeOfTruck() {
        return typeOfTruck;
    }

    /**
     * Este método permite desacelerar un camión en movimiento,
     * reduciendo su velocidad
     *
     * @since: 1.0.0
     */
    public void decelerate() {
        if (velocity > 0) {
            velocity = velocity - 1;
        }
    }

    /**
     * Este método permite frenar un camión en movimiento, reduciendo su
     * velocidad de forma más agresiva respecto al método de desacelerar.
     *
     * @since: 1.0.0
     */
    public void brake() {
        if (velocity > 0) {
            velocity = velocity - 2;
        }
    }

    /**
     * Este método que permite dar movimiento a un camión, aumentando su
     * velocidad.
     *
     * @since: 1.0.0
     */
    @Override
    public void moveAlong() {
        velocity = velocity + 10;
    }
}
