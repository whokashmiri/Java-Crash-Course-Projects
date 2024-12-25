package OverFlow;

public class Constructor {

    public static void main(String[] args) {

        Construct construct = new Construct();
//        System.out.println(construct);
        Construct construct1 = new Construct(2,6);
        construct1.sub();
//


    }
}
class Construct{
    int s;
    int f ;

    public Construct(int s, int f) {
        this.s = s;
        this.f = f;
        System.out.println(s+f);
    }

    public Construct() {
        s =7;
        f= 54;
        System.out.println(s+f);
    }
    void  sub (){
        System.out.println(s-f);

    }
}
