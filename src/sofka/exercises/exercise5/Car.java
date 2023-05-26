package sofka.exercises.exercise5;

import sofka.exercises.exercise4.Vehicle;

/**
 * Esta clase hereda de la clase vehículo y permite construir un vehículo de
 * tipo carro con algunos atributos que diferencian a un carro de otro
 * tipo de vehículo
 *
 * @author: Rusbell Ruiz Portocarrero - rusbell.ruiz.p@gmail.com
 * @version: 1.0.0 26-05-2023
 * @since: 1.0.0
 */
public class Car extends Vehicle {

    /**
     * Esta variable corresponde al número de puertas del carro
     */
    private Integer numberOfDoors;

    /**
     * Esta variable indica si el carro es convertible o no
     */
    private boolean isConvertible;

    /**
     * Método constructor que para crear un carro exige los
     * siguientes parámetros:
     *
     * @param manned        Tripulada o no
     * @param dateFormat    Fecha de matricula del carro
     * @param color         Color del carro
     * @param mark          Marca del carro
     * @param model         Modelo del carro
     * @param numberOfDoors Número de puertas del carro
     * @param isConvertible Es convertible o no
     * @since: 1.0.0
     */
    public Car(
            int manned,
            String dateFormat,
            String color,
            String mark,
            String model,
            Integer numberOfDoors,
            Integer isConvertible
    ) {
        super(manned, dateFormat, "Tierra", color, mark, model);
        this.numberOfDoors = numberOfDoors;
        if (isConvertible == 1) {
            this.isConvertible = true;
        }
        if (isConvertible == 2) {
            this.isConvertible = false;
        }
    }

    /**
     * Este método permite obtener el número de puertas que tiene el carro
     *
     * @return Devuelve el número de puertas que tiene el carro
     * @since: 1.0.0
     */
    public Integer getNumberOfDoors() {
        return numberOfDoors;
    }

    /**
     * Este método permite obtener información de sí el carro es
     * convertible o no.
     *
     * @return Devuelve información de sí el carro es convertible
     * @since: 1.0.0
     */
    public boolean isConvertible() {
        return isConvertible;
    }

    /**
     * Este método permite desacelerar un carro en movimiento,
     * reduciendo su velocidad
     *
     * @since: 1.0.0
     */
    public void decelerate() {
        if (velocity > 0) {
            velocity = velocity - 2;
        }
    }

    /**
     * Este método permite frenar un carro en movimiento, reduciendo su
     * velocidad de forma más agresiva respecto al método de desacelerar.
     *
     * @since: 1.0.0
     */
    public void brake() {
        if (velocity > 0) {
            velocity = velocity - 4;
        }
    }

    /**
     * Este método que permite dar movimiento a un carro, aumentando su
     * velocidad.
     *
     * @since: 1.0.0
     */
    @Override
    public void moveAlong() {
        velocity = velocity + 20;
    }

}
