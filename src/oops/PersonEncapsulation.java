package oops;
// Encapsulation means combining data and the functions that work on that data into a single unit, 
// like a class. In Object-Oriented Programming, it helps keep things organized and secure
public class PersonEncapsulation {
    
    // Private members (hidden from outside)
    private String name;
    private int age;
    //Constructor
    public PersonEncapsulation(String name, int age){
        this.name = name;
        this.age = age;
    }
    //Getter for Name
    public String getName(){
        return name;
    }
    //Setter for Name
    public void setName(String newName){

        this.name = newName;
    }
    //Getter of age
    public int getAge(){
        return age;
    }
    //Setter for age
    public void setAge(int newAge){
        this.age = newAge;
    }

    public static void main(String[] args) {
        PersonEncapsulation p1 = new PersonEncapsulation("Ram", 27);
        System.out.println("Name: "+ p1.getName());
        System.out.println("Age: "+ p1.getAge());
    }



}
