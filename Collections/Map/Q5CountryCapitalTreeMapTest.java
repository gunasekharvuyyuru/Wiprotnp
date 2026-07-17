package Collections.Map;

public class Q5CountryCapitalTreeMapTest {

    public static void main(String[] args) {

        Q5CountryCapitalTreeMap obj = new Q5CountryCapitalTreeMap();

        obj.saveCountryCapital("India", "Delhi");
        obj.saveCountryCapital("Japan", "Tokyo");
        obj.saveCountryCapital("USA", "Washington");

        System.out.println("Country-Capital Map:");
        System.out.println(obj.M1);

        System.out.println("\nCapital of India:");
        System.out.println(obj.getCapital("India"));

        System.out.println("\nCountry of Tokyo:");
        System.out.println(obj.getCountry("Tokyo"));

        System.out.println("\nReverse Map:");
        System.out.println(obj.getReverseMap());

        System.out.println("\nList of Countries:");
        System.out.println(obj.getCountries());
    }
}