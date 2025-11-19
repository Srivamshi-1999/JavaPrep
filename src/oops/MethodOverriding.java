package oops;
// Method overriding in Java means when a subclass provides a specific implementation 
// of a method that is already defined in its superclass. The method in the subclass must 
// have the same name, return type, and parameters as the method in the superclass. 
// Method overriding allows a subclass to modify or extend the behavior of an existing method 
// in the parent class. This enables dynamic method dispatch, where the method
//  that gets executed is determined at runtime based on the object's actual type
class Person{
    void role(){
        System.out.println("Person is a human");
    }
}

class Father extends Person{
    
    void role(){
        System.out.println("father1");
    }
}
public class MethodOverriding {

    public static void main(String[] args) {
        Person obj = new Father();
        obj.role();
    }

}
