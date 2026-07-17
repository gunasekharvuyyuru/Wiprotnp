import java.util.ArrayList;
import java.util.Hashtable;

public class Q6CountryCapitalHashTable {

    Hashtable<String, String> M1 = new Hashtable<>();

    public Hashtable<String, String> saveCountryCapital(String country, String capital) {
        M1.put(country, capital);
        return M1;
    }

    public String getCapital(String country) {
        return M1.get(country);
    }

    public String getCountry(String capital) {
        for (String country : M1.keySet()) {
            if (M1.get(country).equals(capital)) {
                return country;
            }
        }
        return null;
    }

    public Hashtable<String, String> getReverseMap() {
        Hashtable<String, String> M2 = new Hashtable<>();

        for (String country : M1.keySet()) {
            M2.put(M1.get(country), country);
        }

        return M2;
    }

    public ArrayList<String> getCountries() {
        return new ArrayList<>(M1.keySet());
    }
}
