/**
 * Making a planet class for a java longterm project
 *
 * @author Zayaan Hussain
 * @version .010
 */

public class Planet 
{
    private String colorOfPlanet;
    private boolean hasAtmosphere;
    private double planetRadius;
    private String leaderName;
    private int planetPopulation;

    /**
    * This is a default empty constuctor for the 
    * Planet Class (makes a Planet)
    */
    public Planet () {

    }

    /**
     * Custom constuctor that would represent a fully fuctioning Planet
     * which is in its middle lifespan, or mostly any type of lifespan
     */

    public Planet (String colorOfPlanet, boolean hasAtmosphere, double planetRadius, String leaderName, int planetPopulation) {
        this.colorOfPlanet = colorOfPlanet;
        this.hasAtmosphere = hasAtmosphere;
        this.planetRadius = planetRadius;
        this.leaderName = leaderName;
        this.planetPopulation = planetPopulation;
    }

    /**
     * simple accesser to return the planets name
     * @return planetColor 
     */

    public String getColorOfPlanet () {
        return colorOfPlanet;
    }

    /**
     * returns the planet population
     * @return planetPopulation
     */

     public int getPlanetPopulation () {
         return planetPopulation;
     }

     /**
      * this is going to be the method which will return the 
      * volume of the planet.
      * Accessor
      */

      public double getPlanetVolume() {
          return planetRadius * planetRadius * planetRadius * 3.1415 * 4/3;
    }


      /**
       * Mutator for the leaderName which will be able to change it. 
       * @param newLeaderName
       */

       public void newLeaderName(String newLeaderName) {
           leaderName = newLeaderName;
    }

       /**
     * mutator for the planetColor, with this we will be able to change the value of the variable
        @param  newPlanetColor
        */
        
        public void setColorOfPlanet (String newColorOfPlanet) {
            colorOfPlanet = newColorOfPlanet;
    }

    /**
     * This method allows me to pull the current name of the leader of the 
     * planet. 
     */

    public String getLeaderName () {
        return leaderName;
    }

    /**
     * this mutator will allow me to change the status of if
     * the planet has an atmosphere or not. 
     * @param newHasAtmosphere
     */

     public void setHasAtmosphere (boolean newHasAtmosphere) {
        hasAtmosphere = newHasAtmosphere;
    }

    /**
     * basic mutator which will allow me to change the population
     * amount.
     * 
     * @return newPlanetPopulation
     */

     public void newPlanetPopulation (int newPlanetPopulation) {
         planetPopulation = newPlanetPopulation;
     } 

    /**
     * accessor for the variable planetRadius
     * This will return the value of planetRadius
     * @return getPlanetRadius 
     */

     public double getPlanetRadius () {
         return planetRadius;
     }
     
     /** 
      * toString
      *
      *@return string to represent this planet
      */
      public String toString() {
        String output = "";

        output = output + "Planet:" + "\n";
        output = output + "Color of Planet: " + colorOfPlanet + "\n";
        output = output + "Has atmosphere?: " + hasAtmosphere + "\n";
        output = output + "Radius of Planet: " + planetRadius + " x 10^3 " + "\n";
        output = output + "Name of the Planet Leader: " + leaderName + "\n";
        output = output + "Population of the Planet: " + planetPopulation + " people" + "\n";
        
        return output;
    
    }
     
}
