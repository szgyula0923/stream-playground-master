import countries.Countries;
import countries.Country;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Country> countries = new Countries().getAll();

        System.out.println(feladat20(countries));
    }
    public static List<String> feladat20(List<Country> countries) {
        return countries.stream()
                .filter(country -> country.getPopulation() == 0)
                .map(Country::getName)
                .toList();
    }
}
