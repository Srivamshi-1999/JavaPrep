package collections;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListEx {

    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Toyota");
        cars.add("Hyundai");
        cars.add("Nissan");
        System.out.println(cars);
        Collections.sort(cars);
        cars.addFirst("Suzuki");
        for(String i : cars){
            System.out.println(i);
        }
    }
}
