package DSA.OOPS;

 public class Encapsulation {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.teachingClass=33;
        Per per = new Per();
       int age = per.setAge(54);
        System.out.println(age);


    }
}
 class Person{
    int age;
    String name;
}
class Teacher{
    public int teachingClass;
    private int id;

}
class Per{
     private int age;
     private String name;

    public int setAge(int age) {
        this.age = age;
        return age;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }
}

