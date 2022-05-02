package edu.sofka.exercise1;

import java.util.ArrayList;

public class PlanetarySystem {
    ArrayList<Planet> setOfPlanets = new ArrayList<>();
    private double gravitationalPull = 0;
    private double g = 6.674 * Math.pow(10,-11);
    public void addPlanet(Planet planet){
        setOfPlanets.add(planet);
    }

    public ArrayList<Planet> getSystem(){
        return setOfPlanets;
    }

    public double calculateGravitationalAttraction(
            int idPlanet1,
            int idPlanet2,
            double distanceBetweenTwoBodies
    ){
        gravitationalPull = (g * setOfPlanets.get(idPlanet1).getDough() *
                    setOfPlanets.get(idPlanet2).getDough()) /
                    Math.pow(distanceBetweenTwoBodies, 2);
        return gravitationalPull;
    }
}
