package oops;

class Animal{
     void sounds(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{

    void sound(){
        System.out.println("Dog barks");
    }

}
public class AnimalInheritance {

    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.sound();
        obj.sounds();

    }

}

