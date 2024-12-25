package OverFlow;

public class ObjCls {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.att();
        cat.att("red");
//        cat.att("Whte" , "Kashmiri");
        System.out.println(cat.att("white" , "Kashmiri"));

//        Dog dog = new Dog();
//        dog.color = "red";
//        dog.walk();
//        System.out.println(dog);

    }
}
 class Dog{
    String name;
    String color;

    void walk(){
        System.out.println(color+"walking");
    }

}
class Cat  {
    void att(){
        System.out.println("Meow");
    }
    void  att(String color){
        System.out.println( color+"Meowing");

    }
    String  att(String breed , String name){
        System.out.println( "Meowing");
        return  breed + name;

    }

}
