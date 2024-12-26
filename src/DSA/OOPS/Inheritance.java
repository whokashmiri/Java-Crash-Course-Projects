package DSA.OOPS;

public class Inheritance {
    public static void main(String[] args) {
       Car car = new Car();
        System.out.println(  car.wheelsCount=4);
       car.start();
        System.out.println( car.brand="i10");

    }
}
class Vehicle{
    int wheelsCount;
    void start(){
        System.out.println("Vehicles is Starting");
    }
}
class Car extends Vehicle  {
String brand ;
Scooter scooter = new Scooter();

void start(){
    scooter.braking(this);
    System.out.println("From Car");
    super.start();
}
}


class  Scooter{
    void  braking(Car car){
        System.out.println("Scooter");
    }
}