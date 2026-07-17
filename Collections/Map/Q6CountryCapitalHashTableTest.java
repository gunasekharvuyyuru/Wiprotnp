public class Q6CountryCapitalHashTableTest {

    public static void main(String[] args) {

        Q6CountryCapitalHashTable obj = new Q6CountryCapitalHashTable();

        obj.saveCountryCapital("India", "Delhi");
        obj.saveCountryCapital("Japan", "Tokyo");
        obj.saveCountryCapital("USA", "Washington");

        System.out.println(obj.M1);
        System.out.println(obj.getCapital("India"));
        System.out.println(obj.getCountry("Tokyo"));
        System.out.println(obj.getReverseMap());
        System.out.println(obj.getCountries());
    }
}