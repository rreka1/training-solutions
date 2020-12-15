package week08d02;

public class Country {

    private String countryName;
    private int population;
    private int numOfColors;
    private int numOfNeighbours;

    public Country(String countryName, int population, int numOfColors, int numOfNeighbours) {
        this.countryName = countryName;
        this.population = population;
        this.numOfColors = numOfColors;
        this.numOfNeighbours = numOfNeighbours;
    }

    public String getCountryName() {
        return countryName;
    }

    public int getPopulation() {
        return population;
    }

    public int getNumOfColors() {
        return numOfColors;
    }

    public int getNumOfNeighbours() {
        return numOfNeighbours;
    }

    @Override
    public String toString() {
        return countryName + " - population: " + population + " - colors: " + numOfColors + " - neighbours: " + numOfNeighbours;
    }
}
