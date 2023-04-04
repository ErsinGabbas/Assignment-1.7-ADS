import java.util.*;

public class Main {
    //Function
    public static List<String> permutations(String str) {
        List<String> result = new ArrayList<>();
        if (str.length() == 0) {
            result.add("");
            return result;
        }
        char first = str.charAt(0);
        String remaining = str.substring(1);
        List<String> perms = permutations(remaining);
        for (String perm : perms) {
            for (int i = 0; i <= perm.length(); i++) {
                String newPerm = insertCharAt(perm, first, i);
                result.add(newPerm);
            }
        }
        return result;
    }
    public static String insertCharAt(String str, char c, int i) {
        String start = str.substring(0, i);
        String end = str.substring(i);
        return start + c + end;
    }

    public static void main(String[] args) {
        //Function work check
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        List<String> perms = permutations(str);
        for (String perm : perms) {
            System.out.println(perm);
        }
    }
}
