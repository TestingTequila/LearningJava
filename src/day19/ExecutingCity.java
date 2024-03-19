package day19;

public class ExecutingCity
{
    public static void main(String[] args) {
        //City c1 = new City(); Not possible as constructor is private
        City.cityName = "New York";
        City.cityDetails("London");
        City.cityPopulation();
        City.cityCapital();

    }
}
