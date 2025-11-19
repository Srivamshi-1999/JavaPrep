package oops;

//compile time polymorphism
// Method overloading in Java means when there are multiple functions 
// with the same name but different parameters then these functions are 
// said to be overloaded. Functions can be overloaded by changes in the number of 
// arguments or/and a change in the type of arguments
public class MethodOverloading {
    static int multiply(int a, int b){
        return a*b;
    }

    static double multiply(double a, double b){
        return a*b;

    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        System.out.println(obj.multiply(42, 34));
        System.out.println(obj.multiply(8.99, 5.99));
    }

}
