package sofka.exercises.exercise4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Esta clase abstracta representa algunos atributos y métodos con los que
 * cuenta un vehículo en general
 *
 * @author: Rusbell Ruiz Portocarrero - rusbell.ruiz.p@gmail.com
 * @version: 1.0.0 26-05-2023
 * @since: 1.0.0
 */
public abstract class Vehicle {
    /**
     * Esta variable indica si el vehículo es tripulado o no
     */
    private boolean manned = false;

    /**
     * Esta variable Corresponde a la fecha de matrícula del vehículo
     */
    private Date registrationDate;

    /**
     * Esta variable indica el medio por el cual se desplaza el
     * vehículo (tierra, agua, aire).
     */
    private String displacementMedium;

    /**
     * Esta variable corresponde al color del vehículo
     */
    private String color;

    /**
     * Esta variable corresponde a la marca del vehículo
     */
    private String mark;

    /**
     * Esta variable corresponde al modelo del vehículo
     */
    private String model;

    /**
     * Esta variable corresponde a la velocidad actual del vehículo
     */
    protected Integer velocity;

    /**
     * Metodo constructor, que para crear un vehiculo exige los siguientes
     * parametros:
     *
     * @param manned             Indica si el vehículo es tripulado o no
     * @param dateFormat         Fecha de matricula
     * @param displacementMedium Medio por el que se desplaza
     * @param color              Color del vehículo
     * @param mark               Marca del vehículo
     * @param model              Modelo del vehículo
     * @since: 1.0.0
     */
    public Vehicle(
            int manned,
            String dateFormat,
            String displacementMedium,
            String color,
            String mark,
            String model
    ) {
        if (manned == 1) {
            this.manned = true;
        }
        if (manned == 2) {
            this.manned = false;
        }
        changeFormat(dateFormat);
        this.displacementMedium = displacementMedium;
        this.color = color;
        this.mark = mark;
        this.model = model;
    }

    /**
     * Método abstracto que permite establecer la forma en que se van a
     * desplazar los vehículos, dado que todo vehiculo se debe desplazar de
     * alguna manera
     *
     * @since: 1.0.0
     */
    public abstract void moveAlong();

    /**
     * Es un método que nos permite convertir la fecha del usuario ingresada en
     * un formato común (dd/mm/aaaa) al formato que maneja por defecto la
     * clase Date
     *
     * @param date corresponde a la fecha de matrícula del vehículo
     *             formato dd/mm/aaaa y de tipo String
     * @since: 1.0.0
     */
    private void changeFormat(String date) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        /**
         * Si todo sale bien hace el cambio de formato de la fecha de
         * nacimiento, de lo contrario nos devuelve una excepción
         */
        try {
            this.registrationDate = format.parse(date);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * Este método permite obtener información de sí el vehículo es o
     * no tripulado
     *
     * @return Devuelve el valor de si es o no tripulado
     * @since: 1.0.0
     */
    public boolean isManned() {
        return manned;
    }

    /**
     * Este método permite obtener la fecha de matrícula del vehículo
     *
     * @return Devuelve la fecha de matricula del vehículo
     * @since: 1.0.0
     */
    public Date getRegistrationDate() {
        return registrationDate;
    }

    /**
     * Este método permite obtener el medio por el cual se desplaza el vehículo
     *
     * @return Devuelve el valor del medio por el cual se desplaza el vehículo
     * @since: 1.0.0
     */
    public String getDisplacementMedium() {
        return displacementMedium;
    }

    /**
     * Este método permite obtener el color del vehículo
     *
     * @return Devuelve el color del vehículo
     * @since: 1.0.0
     */
    public String getColor() {
        return color;
    }

    /**
     * Este método permite obtener la marca del vehículo
     *
     * @return Devuelve la marca del vehículo
     * @since: 1.0.0
     */
    public String getMark() {
        return mark;
    }

    /**
     * Este método permite obtener el modelo del vehículo
     *
     * @return Devuelve el modelo del vehículo
     * @since: 1.0.0
     */
    public String getModel() {
        return model;
    }

}
