package oops;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListEx {

    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Toyota");
        cars.add("Hyundai");
        cars.add("Nissan");
        Collections.sort(cars);
        for(String i : cars){
            System.out.println(i);
        }
    }
}
