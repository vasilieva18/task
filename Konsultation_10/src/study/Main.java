package study;

public class Main {

    public static void main(String[] args) {
        City myCity = new City("Kyiv");
        myCity.population = (int)5E6;//5 000 000 = 5 * 10^6 =5E6
        myCity.country = Country.Ukraine;
        City secondCity = new City("Warshawa");
        secondCity.population = 2_000_000;
        secondCity.country = Country.Poland;
        City thirdCity = new City("Paris");
        thirdCity.population = 5_000_000;
        thirdCity.country = Country.France;
        myCity.printPopulation();
        secondCity.printPopulation();
        thirdCity.printPopulation();
        City fourCity = new City("Madrid", 10_000_000);
    }
}
