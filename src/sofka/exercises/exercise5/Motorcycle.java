package sofka.exercises.exercise5;

import sofka.exercises.exercise4.Vehicle;

/**
 * Esta clase hereda de la clase vehículo y permite construir un vehículo de
 * tipo motocicleta con algunos atributos que diferencian a una motocicleta de
 * otro tipo de vehículo
 *
 * @author: Rusbell Ruiz Portocarrero - rusbell.ruiz.p@gmail.com
 * @version: 1.0.0 26-05-2023
 * @since: 1.0.0
 */
public class Motorcycle extends Vehicle {
    /**
     * Esta variable representa el tipo de frenos de la motocicleta
     */
    private String typeOfBrakes;

    /**
     * Esta variable representa el tipo de encendido de la motocicleta
     */
    private String ignitionType;

    /**
     * Método constructor que para crear una motocicleta exige los
     * siguientes parámetros:
     *
     * @param manned       Tripulada o no
     * @param dateFormat   Fecha de matricula de la moto
     * @param color        Color de la moto
     * @param mark         Marca de la moto
     * @param model        Modelo de la moto
     * @param typeOfBrakes Tipo de frenos de la moto
     * @param ignitionType Tipo de encendido de la moto
     * @since: 1.0.0
     */
    public Motorcycle(
            int manned,
            String dateFormat,
            String color,
            String mark,
            String model,
            String typeOfBrakes,
            String ignitionType
    ) {
        super(manned, dateFormat, "Tierra", color, mark, model);
        this.typeOfBrakes = typeOfBrakes;
        this.ignitionType = ignitionType;
    }

    /**
     * Este método permite obtener el tipo de frenos que tiene la moto
     *
     * @return Devuelve el tipo de frenos
     * @since: 1.0.0
     */
    public String getTypeOfBrakes() {
        return typeOfBrakes;
    }

    /**
     * Este método permite obtener el tipo de encendido que tiene la moto
     *
     * @return Devuelve el tipo de encendido de la moto
     * @since: 1.0.0
     */
    public String getIgnitionType() {
        return ignitionType;
    }

    /**
     * Este método permite desacelerar una motocicleta en movimiento,
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
     * Este método permite frenar una motocicleta en movimiento, reduciendo su
     * velocidad de forma más agresiva respecto al método de desacelerar.
     *
     * @since: 1.0.0
     */
    public void brake() {
        if (velocity > 0) {
            velocity = velocity - 3;
        }
    }

    /**
     * Este método que permite dar movimiento a una motocicleta, aumentando su
     * velocidad.
     *
     * @since: 1.0.0
     */
    @Override
    public void moveAlong() {
        velocity = velocity + 18;
    }
}
