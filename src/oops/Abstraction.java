package oops;

// An abstract class is a class that cannot be instantiated and may contain 
// abstract methods (methods without body) as well as concrete methods (with implementation).

abstract class Shape{
    String color;
    //below are abstract methods
    abstract double area();
    public abstract String toString();

    //abstract class can have constructor
    public Shape(String color){
        System.out.println("Shape constructor called");
        this.color = color;
    }

    //concrete method is a method which has implementation  
    public String getColor(){
        return color;
    }

}
class Circle extends Shape{
    double radius;
    public Circle(String color, double radius){
        //calling Shape constructor
        super(color);
        System.out.println("Circle constructor is called");
        this.radius = radius;
    }
    @Override
    double area(){
        return Math.PI * Math.pow(radius, 2);
    }
    @Override
    public String toString(){
        return "Circle color is "+ super.getColor() + " and area is :"+ area();

    }

}
public class Abstraction {

    public static void main(String[] args) {
        
        Shape s1 = new Circle("Red", 2.2);
        System.out.println(s1.toString());
    }
}
