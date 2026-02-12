package collections;
import java.util.HashSet;
public class HastSetEx {
    public static void main(String[] args){
        HashSet<String> cars = new HashSet<String>();
        cars.add("Hyundai");
        cars.add("Suzuki");
        cars.add("Hyundai");//Duplicate
        for(String i : cars){
            System.out.println(i);
        }
    }

}
