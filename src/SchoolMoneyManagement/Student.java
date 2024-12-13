package SchoolMoneyManagement;

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feePaid;
    private int feeTotal;

    public  Student(int id , String name, int grade ){
        this.feePaid =0;
        this.feeTotal=3000;
        this.id = id;
        this.name= name;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeePaid() {
        return feePaid;
    }

    public int getFeeTotal() {
        return feeTotal;
    }
    public void updateFee(int fees){
        feePaid +=fees;
        School.updateTotalMoneySpend(fees);


    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setFeePaid(int feePaid) {
        this.feePaid = feePaid;
    }

    public void setFeeTotal(int feeTotal) {
        this.feeTotal = feeTotal;
    }

    public  int getFeeRemaining(){
        return feePaid-feeTotal;
    }


}
