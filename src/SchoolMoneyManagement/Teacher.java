package SchoolMoneyManagement;

public class Teacher {
    private int id;
    private String name;
    private int salary;

    public Teacher(int id, String name , int salary){
        this.id = id;
        this.name= name;
        this.salary = salary;
    }


    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId(int id){
        return id;

    }
    public String getName(String name){
        return name;

    }
    public int getSalary(int salary){
        return salary;

    }


}
