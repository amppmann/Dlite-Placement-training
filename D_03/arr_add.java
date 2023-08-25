import java.util.*;

public class arr_add {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        System.out.println("Enter the first number : ");
        for(int i = 0; i < 5 ; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the second number : ");
        for(int j = 0 ; j < 5 ; j++){
            arr2[j] = sc.nextInt();
        }
        int n1 = 0;
        for (int digit : arr1) {
            n1 = n1 * 10 + digit;
        }
        int n2 = 0;
        for (int digit : arr2) {
            n2 = n2 * 10 + digit;
        }
        int n3 = n1 + n2;
        // System.out.print(n3);
        int rev = 0;
        ArrayList<Integer> array = new ArrayList<Integer>();
        do{
            array.add(n3 % 10);
            n3 /= 10;
        } while  (n3 > 0);
        System.out.println("The array elements are after addition : ");
        Collections.reverse(array);
        for (Integer element : array) {
            System.out.print(element+" ");
        }
    }
}
