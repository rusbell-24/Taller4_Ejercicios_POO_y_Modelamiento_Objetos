package sofka.exercises.exercise4;

/**
 * Esta clase extiendo de la clase Vehículo, y permite construir vehículos tipo
 * ferry
 *
 * @author: Rusbell Ruiz Portocarrero - rusbell.ruiz.p@gmail.com
 * @version: 1.0.0 26-05-2023
 * @since: 1.0.0
 */
public class Ferry extends Vehicle {

    /**
     * Este variable corresponde al tipo de ferry
     */
    private String typeOfFerry;

    /**
     * Esta variable corresponde al largo del ferry
     */
    private double alongTheFerry;

    /**
     * Método constructor que para la construcción del ferry exige los
     * siguientes parámetros
     *
     * @param manned        almacena información de si el ferry es tripulado o no
     * @param dateFormat    Corresponde a la fecha de matrícula del ferry
     * @param color         Corresponde al color del ferry
     * @param mark          Corresponde a la marca del ferry
     * @param model         Corresponde al modelo del ferry
     * @param typeOfFerry   Corresponde al tipo de ferry
     * @param alongTheFerry Corresponde al largo del ferry
     * @since: 1.0.2
     */
    public Ferry(
            int manned,
            String dateFormat,
            String color,
            String mark,
            String model,
            String typeOfFerry,
            double alongTheFerry
    ) {
        super(manned, dateFormat, "Agua", color, mark, model);
        this.typeOfFerry = typeOfFerry;
        this.alongTheFerry = alongTheFerry;
    }

    /**
     * Este método brinda la funcionalidad de poder desacelerar el ferry
     *
     * @since: 1.0.0
     */
    public void decelerate() {
        velocity = velocity - 1;
    }

    /**
     * Este método brinda la funcionalidad de poder mover el ferry al
     * aumentar su velocidad
     *
     * @since: 1.0.0
     */
    @Override
    public void moveAlong() {
        velocity = velocity + 3;
    }

    /**
     * Este método permite obtener información sobre el tipo de ferry que es
     *
     * @return Devuelve el tipo de ferry
     * @since: 1.0.0
     */
    public String getTypeOfFerry() {
        return typeOfFerry;
    }

    /**
     * Este método permite obtener el largo del ferry en cuestión
     *
     * @return Devuelve el valor del largo del ferry
     * @since: 1.0.0
     */
    public double getAlongTheFerry() {
        return alongTheFerry;
    }
}
