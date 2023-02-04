package study;

public class City {
    String name;
    int population;
    Country country;

    City(){

    }

    City(String name){
        this.name = name;
    }
    City(String name, int population){
        this.name = name;
        this.population = population;
    }

    public void printPopulation()
    {
        System.out.println("In "+ name + " is " + population +" people.");
    }
}
