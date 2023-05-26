package sofka.exercises.exercise5;

import sofka.exercises.exercise4.Vehicle;

/**
 * Esta clase hereda de la clase vehículo y permite construir un vehículo de
 * tipo bicicleta con algunos atributos que diferencian a una bicicleta de otro
 * tipo de vehículo
 *
 * @author: Rusbell Ruiz Portocarrero - rusbell.ruiz.p@gmail.com
 * @version: 1.0.0 26-05-2023
 * @since: 1.0.0
 */
public class Bicycle extends Vehicle {

    /**
     * Esta variable corresponde al numero de platos que tiene la bicicleta
     */
    private Integer numberOfDishes;

    /**
     * Método constructor que para crear una bicicleta exige los
     * siguientes parámetros:
     *
     * @param manned         Tripulada o no
     * @param dateFormat     Fecha de matricula de la bicicleta
     * @param color          Color de la bicicleta
     * @param mark           Marca de la bicicleta
     * @param model          Modelo de la bicicleta
     * @param numberOfDishes Numero de platos de la bicicleta
     * @since: 1.0.0
     */
    public Bicycle(
            int manned,
            String dateFormat,
            String color,
            String mark,
            String model,
            Integer numberOfDishes
    ) {
        super(manned, dateFormat, "Tierra", color, mark, model);
        this.numberOfDishes = numberOfDishes;
    }

    /**
     * Este método permite obtener el número de platos que tiene la bicicleta
     *
     * @return Devuelve el numero de platos que tiene la bicicleta
     * @since: 1.0.0
     */
    public Integer getNumberOfDishes() {
        return numberOfDishes;
    }

    /**
     * Este método permite desacelerar una bicicleta en movimiento,
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
     * Este método permite frenar una bicicleta en movimiento, reduciendo su
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
     * Este método que permite dar movimiento a una bicicleta, aumentando su
     * velocidad.
     *
     * @since: 1.0.0
     */
    @Override
    public void moveAlong() {
        velocity = velocity + 2;
    }
}
