package DSA.OOPS;

import java.util.Date;
interface  Walk{
    int walks(int steps);
}

public class Abstraction {
    public static void main(String[] args) {
//        A a = new A();
        B b = new B();
        b.run();
        b.stop(5);
        b.honk();
        Interface in = new Interface();
        in.eats();
        System.out.println(  in.up());
        System.out.println(in.pet());
        in.func();
        Walk walk =(int steps)->{
            System.out.println("Stepping");
            System.out.println("FROM LAMBDA");
            return steps;
        };

        System.out.println(walk.walks(45));
//        System.out.println(st);


    }
}
abstract class A{

    abstract void run();
    abstract int stop(int wheels);
    void honk(){
        System.out.println("Honking");
    }

}
class B extends A{

    @Override
    void run() {
        System.out.println("Running");
    }

    @Override
    int stop(int wheels) {
        System.out.println("Stopping");
        return wheels;
    }
}

interface Animal{
     void eats();
     String up();

}
interface Pets{
    String pet();

}
class Interface implements Animal,Pets{
    int age;
    void func(){

        System.out.println(Math.random()*1000);

    }


    @Override
    public void eats() {
        System.out.println(this.age + "Age");
        System.out.println("Eating");
    }

    @Override
    public String up() {
        return "Serving";
    }


    @Override
    public String pet() {
        return "From Pet";
    }
}
