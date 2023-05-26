package sofka.exercises.exercise1;

/**
 * Esta clase permite crear planetas con algunos de sus atributos más
 * Relevantes (id, nombre, masa, densidad, diámetro, distancia del sol)
 *
 * @author: Rusbell Ruiz Portocarrero - rusbell.ruiz.p@gmail.com
 * @version: 1.0.2 26-05-2023
 * @since: 1.0.0
 */
public class Planet {

    /**
     * Esta variable representa la masa del planeta
     */
    private double dough;

    /**
     * Esta variable representa de densidad del planeta
     */
    private double density;

    /**
     * Esta variable representa el diámetro del planeta
     */
    private double diameter;

    /**
     * Esta variable corresponde a la distancia entre el planeta y el sol
     */
    private double distanceToTheSun;

    /**
     * Esta variable corresponde a un identificador único para cada planeta
     */
    private final int id;

    /**
     * Esta variable corresponde al nombre del planeta
     */
    private String name;

    /**
     * Método constructor que para la construcción del planeta exige los
     * siguientes parámetros.
     *
     * @param name             Nombre del planeta
     * @param id               Identificador único del planeta
     * @param dough            Masa del planeta
     * @param density          Densidad del planeta
     * @param diameter         Diámetro del planeta
     * @param distanceToTheSun Distancia entre el planeta y el sol
     * @since: 1.0.0
     */
    public Planet(
            String name,
            int id,
            double dough,
            double density,
            double diameter,
            double distanceToTheSun
    ) {
        this.name = name;
        this.id = id;
        this.dough = dough;
        this.density = density;
        this.diameter = diameter;
        this.distanceToTheSun = distanceToTheSun;
    }

    /**
     * Este método permite obtener la masa de un planeta en específico
     *
     * @return Devuelve la masa del planeta
     * @since: 1.0.0
     */
    public double getDough() {
        return dough;
    }

    /**
     * Este método permite modificar el valor de la masa del planeta
     *
     * @param dough Representa la masa del planeta
     * @since: 1.0.0
     */
    public void setDough(double dough) {
        this.dough = dough;
    }

    /**
     * Este método permite obtener la densidad de un planeta en específico
     *
     * @return Devuelve el valor de la densidad del planeta
     * @since: 1.0.0
     */
    public double getDensity() {
        return density;
    }

    /**
     * Este método permite modificar el valor de la densidad del planeta
     *
     * @param density Representa la densidad del planeta
     * @since: 1.0.0
     */
    public void setDensity(double density) {
        this.density = density;
    }

    /**
     * Este método permite obtener el diámetro de un planeta en específico
     *
     * @return Devuelve el valor del diámetro del planeta
     * @since: 1.0.0
     */
    public double getDiameter() {
        return diameter;
    }

    /**
     * Este método permite modificar el valor del diámetro del planeta
     *
     * @param diameter Representa el diámetro del planeta
     * @since: 1.0.0
     */
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    /**
     * Este método permite obtener el valor de la distancia entre el planeta y
     * el sol.
     *
     * @return Devuelve el valor de dicha distancia
     * @since: 1.0.0
     */
    public double getDistanceToTheSun() {
        return distanceToTheSun;
    }

    /**
     * Este método permite modificar el valor de la distancia entre el planeta
     * y el sol
     *
     * @param distanceToTheSun Representa la distancia entre el planeta y el sol
     * @since: 1.0.0
     */
    public void setDistanceToTheSun(double distanceToTheSun) {
        this.distanceToTheSun = distanceToTheSun;
    }

    /**
     * Este método permite obtener el nombre del planeta
     *
     * @return Devuelve el nombre del planeta
     * @since: 1.0.0
     */
    public String getName() {
        return name;
    }

    /**
     * Este método permite modificar el nombre de un planeta en específico.
     *
     * @param name Representa el nombre del planeta
     * @since: 1.0.0
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Este método permite acceder al valor del identificador único del planeta
     *
     * @return Devuelve el valor del identificador único
     * @since: 1.0.0
     */
    public int getId() {
        return id;
    }
}
