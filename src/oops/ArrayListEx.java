package oops;

import java.util.ArrayList;
import java.util.Collections;
public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(11);
        myNumbers.add(8);
        System.out.println(myNumbers);
        Collections.sort(myNumbers);
        for(int i : myNumbers){
            System.out.println(i);
        }
        //Collections.sort(myNumbers);
        
        
    }

}
