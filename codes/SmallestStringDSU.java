import java.util.*;
import java.util.Scanner;

/**
 * SmallestStringDSU
 */
public class SmallestStringDSU {
    static String solution(String A, String B, String T, int n1, int n2, int n3) {

        HashMap<Character, ArrayList<Character>> map = new HashMap<>();

        for (int i = 0; i < n1; i++) {
            char c1 = A.charAt(i) < B.charAt(i) ? A.charAt(i) : B.charAt(i);
            char c2 = A.charAt(i) > B.charAt(i) ? A.charAt(i) : B.charAt(i);

            if (!map.containsKey(c1)) {
                map.put(c1, new ArrayList<>(Arrays.asList(c2)));
            }
            if (map.containsKey(c2)) {
                map.get(c1).addAll(map.get(c2));
            }
        }
        for (Map.Entry<Character, ArrayList<Character>> entry : map.entrySet()) {
            Character key = entry.getKey();
            ArrayList<Character> value = entry.getValue();
            System.out.println("Key: " + key);
            System.out.print("Values: ");
            for (Character val : value) {
                System.out.print(" " + val);
            }
            System.out.println();
        }

        return "";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();
        String T = sc.next();

        int n1 = A.length();
        int n2 = B.length();
        int n3 = T.length();

        String res = solution(A, B, T, n1, n2, n3);

    }
}