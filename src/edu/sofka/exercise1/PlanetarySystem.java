package edu.sofka.exercise1;

import java.util.ArrayList;

/**
 * Esta clase permite crear un sistema planetario de n planetas, a partir de
 * unos planetas ya creados con sus respectivos atributos.
 *
 * @author: Rusbell Ruiz Portocarrero - rusbell.ruiz.p@gmail.com
 * @version: 1.0.2 01-05-2022
 * @since: 1.0.0
 */
public class PlanetarySystem {

    /**
     * Este array almacenará todos los planetas del sistema planetario
     */
    private ArrayList<Planet> setOfPlanets = new ArrayList<>();

    /**
     * Esta variable almacena el valor de la atracción gravitacional entre dos
     * planetas cuales quiera del sistema planetario
     */
    private double gravitationalPull = 0;

    /**
     * Esta variable representa la constante gravitacional universal
     */
    private double g = 6.674 * Math.pow(10, -11);

    /**
     * Este método permite añadir planetas al array que representa el
     * sistema planetario
     *
     * @param planet Planeta que se añadirá al sistema planetario
     * @since: 1.0.0
     */
    public void addPlanet(Planet planet) {
        setOfPlanets.add(planet);
    }

    /**
     * Este método nos permite acceder al sistema planetario, con todos los
     * planetas que lo conforman
     *
     * @return Devuelve el array que representa el sistema planetario
     * @since: 1.0.0
     */
    public ArrayList<Planet> getSystem() {
        return setOfPlanets;
    }

    /**
     * Este método permite calcular la atracción gravitacional entre
     * dos planetas cuales quiera que pertenezcan al sistema planetario
     *
     * @param idPlanet1                Identificador del primer planeta para el cálculo de la
     *                                 atracción gravitatoria
     * @param idPlanet2                Identificador del segundo planeta para el cálculo de la
     *                                 atracción gravitatoria
     * @param distanceBetweenTwoBodies Distancia que separa al primer y
     *                                 segundo planeta
     * @return Devuelve el valor de la atracción gravitatoria calculada entre
     * el planeta1 y el planeta2
     * @since: 1.0.0
     */
    public double calculateGravitationalAttraction(
            int idPlanet1,
            int idPlanet2,
            double distanceBetweenTwoBodies
    ) {
        gravitationalPull = (g * setOfPlanets.get(idPlanet1).getDough() *
                setOfPlanets.get(idPlanet2).getDough()) /
                Math.pow(distanceBetweenTwoBodies, 2);

        return gravitationalPull;
    }
}
