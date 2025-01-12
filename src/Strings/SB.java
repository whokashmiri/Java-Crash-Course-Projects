package Strings;

public class SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        char ch = 'a';
        for (int i = 0; i < 26; i++) {
            char chh = (char)(ch +i);
            builder.append(chh + " ");
        }
        System.out.println(builder +" ");
        builder.deleteCharAt(5);
        System.out.println(builder);
    }
}
