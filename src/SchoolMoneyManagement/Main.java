package SchoolMoneyManagement;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher Jon = new Teacher(1,"jon",500);
        Teacher Tom = new Teacher(2,"tom",700);
        Teacher Van = new Teacher(3,"van",700);
        List<Teacher> teacherList  = new ArrayList<>();
        teacherList.add(Jon);
        teacherList.add(Tom);
        teacherList.add(Van);

        Student a = new Student(1,"A",12);
        Student b = new Student(2,"b",9);
        List<Student> studentList  = new ArrayList<>();
        studentList.add(a);
        studentList.add(b);

        School abs = new School(teacherList,studentList);
        System.out.println(abs.getTotalMoneyEarned());
        a.updateFee(25000);
    }
}
