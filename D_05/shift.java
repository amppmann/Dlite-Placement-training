import java.util.*;

public class shift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] shifts = new int[3];
        for(int i = 0 ; i < 3 ; i++){
            shifts[i] = sc.nextInt();
        }
        String result = shiftingLetters(s, shifts);
        System.out.println(result); 
    }
    public static String shiftingLetters(String s, int[] shifts) {
        int n = s.length();
        int totshift = 0;
        for (int i = n - 1; i >= 0; i--) {
            totshift = (totshift + shifts[i]) % 26;
            char c = s.charAt(i);
            char newChar = (char) ((c - 'a' + totshift) % 26 + 'a'); 
            s = s.substring(0, i) + newChar + s.substring(i + 1); 
        }
        return s;
    }
}
