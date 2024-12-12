package Email;

import java.util.Scanner;

public class Email {
    private String firstName ;
    private String lastName;
    private String email;
    private String password;
    private  int defaultPasswordLength = 11;
    private String department;
    private int mailBoxCapacity = 50;
    private String alternativeEmail;
    private String companySuffix = "company.com";

    public Email (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email.Email Created: " + this.firstName + " " + this.lastName);
        this.department = setDepartment();
        System.out.println("Department is: " +this.department );
        this.password = randPassword(defaultPasswordLength);
        System.out.println(this.password);
        email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
        System.out.println("YOUR EMAIL: " + this.email);

    }
    private String setDepartment(){
        System.out.print("Department Numbers\n1 for Sales \n2 for Development\n3 for Accounting\n0 for None\nEnter Department Number: ");
        Scanner scanner = new Scanner(System.in);
        int depChoice = scanner.nextInt();
        if(depChoice==1) {return "sales";}
        else if(depChoice==2) {return  "development";}
        else if (depChoice==3) {return  "accounting";}
        else {
            return "";
        }

    }
    private String randPassword(int length) {
        String passwordSet ="ABCDEFGHIJKLMNOPRSTUVWXYZ123456789@#$%^&*";
        char [] password = new char[length];
        for(int i =0; i<length ; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
    public void setMailBoxCapacity(int capacity){
        this.mailBoxCapacity = capacity;
    }
    public void setAlternativeEmail(String altEmail){
        this.alternativeEmail = altEmail;
    }
    public void changePassword(){
        this.password = password;
    }

    public  int getMailBoxCapacity(){
        return mailBoxCapacity;
    }
    public String getAlternativeEmail(){
        return alternativeEmail;
    }
    public String getPassword(){
        return password;
    }


    public  String showInfo(){
        return "DISPLAY NAME " + firstName + " "+ lastName +" "+ "COMPANY EMAIL " + email + " "+ "MAILBOX CAPACITY "+ " "+ mailBoxCapacity;
    }

}
