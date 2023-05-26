package sofka.exercises.exercise5;

import sofka.exercises.exercise4.Vehicle;

/**
 * Esta clase hereda de la clase vehículo y permite construir un vehículo de
 * tipo lancha con algunos atributos que diferencian a una lancha de otro
 * tipo de vehículo
 *
 * @author: Rusbell Ruiz Portocarrero - rusbell.ruiz.p@gmail.com
 * @version: 1.0.0 26-05-2023
 * @since: 1.0.0
 */
public class Boat extends Vehicle {

    /**
     * Esta variable corresponde al numero de motores que tendrá la lancha
     */
    private Integer numberOfEngines;

    /**
     * Esta variable indica si la lancha tendrá techo o no.
     */
    private boolean roof;

    /**
     * Método constructor que para crear una lancha exige los
     * siguientes parámetros:
     *
     * @param manned          Tripulada o no
     * @param dateFormat      Fecha de matricula de la lancha
     * @param color           Color de la lancha
     * @param mark            Marca de la lancha
     * @param model           Modelo de la lancha
     * @param numberOfEngines Numero de motores de la lancha
     * @param roof            Indica si la lancha tendrá techo o no
     * @since: 1.0.0
     */
    public Boat(
            int manned,
            String dateFormat,
            String color,
            String mark,
            String model,
            Integer numberOfEngines,
            Integer roof) {
        super(manned, dateFormat, "Agua", color, mark, model);
        this.numberOfEngines = numberOfEngines;
        if (roof == 1) {
            this.roof = true;
        }
        if (roof == 2) {
            this.roof = false;
        }

    }

    /**
     * Este método permite obtener el número de motores que tiene la lancha
     *
     * @return Devuelve el numero de motores
     * @since: 1.0.0
     */
    public Integer getNumberOfEngines() {
        return numberOfEngines;
    }

    /**
     * Este método permite obtener información de sí la lancha tiene techo o no
     *
     * @return Devuelve información de sÍ la lancha tiene techo
     * @since: 1.0.0
     */
    public boolean isRoof() {
        return roof;
    }

    /**
     * Este método permite desacelerar una lancha en movimiento,
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
     * Este método que permite dar movimiento a una lancha, aumentando su
     * velocidad.
     *
     * @since: 1.0.0
     */
    @Override
    public void moveAlong() {
        velocity = velocity + 15;
    }
}
