import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        ArrayList<CapitalCities> ar = new ArrayList<CapitalCities>();
        ar.add(new CapitalCities("Germany", "Berlin"));
        ar.add(new CapitalCities("France", "Paris"));
        ar.add(new CapitalCities("USA", "Washington DC"));
        ar.add(new CapitalCities("ABC", "QWE"));
        ar.add(new CapitalCities("123", "222"));        

        Scanner myScanner = new Scanner(System.in);
        String country = myScanner.nextLine();
        boolean found = false;

        for (CapitalCities city : ar) {
            if (city.getCountry().equals(country)) {
                found = true;
                System.out.println("The capital of " + country + " is " + city.getCapital());
                break;
            }
        }

        if (!found)
            System.out.println("There's no capital!");
    }
}