package Strings;

import java.util.Arrays;

public class SBOne {
    public static void main(String[] args) {
        String name ="Aaqib Bashir Mir";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(Arrays.toString(name.split("as")));
        System.out.println(Arrays.toString(name.split("")));
    }
}
