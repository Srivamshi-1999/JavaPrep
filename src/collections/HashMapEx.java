package collections;
import java.util.HashMap;

public class HashMapEx {
    public static void main(String[] args){
        HashMap<String,String> capitalCities = new HashMap<String, String>();
        capitalCities.put("India", "Delhi");
        capitalCities.put("Austria", "Wien");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Norway", "Osloo"); // Duplicate
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);
        System.out.println(capitalCities.get("India"));
        // Print keys
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }
        // Print values
        for (String i : capitalCities.values()) {
        System.out.println(i);
        }
    }
}
