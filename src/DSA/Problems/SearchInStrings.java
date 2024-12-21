package DSA.Problems;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "aaqib";
//        char c = 'i';
        System.out.println(search(name));
    }
    static boolean search(String str){
        for (int i = 0; i < str.length(); i++) {
            if('i'==(str.charAt(i))){
                return true;

            }

        }
        return false;
    }
}
