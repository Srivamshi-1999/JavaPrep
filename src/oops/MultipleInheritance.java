package oops;

interface landVehicle{

    default void landInfo(){//Introduced in Java 8, the default keyword allows you to define methods with a complete implementation directly within an interface
        System.out.println("This is land vehicle");
    }

}

interface waterVehicle{
    default void waterInfo(){
        System.out.println("This is water vehicle");
    }

}
public class MultipleInheritance implements landVehicle, waterVehicle {
    public static void main(String[] args) {
        
        MultipleInheritance obj = new MultipleInheritance();
        obj.waterInfo();
        obj.landInfo();
    }

}
