import java.util.Scanner;

public class arr {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 1 ; i < n ; i++){
            if(arr[i-1] < arr[i]){
                count++;
            }
        }
        System.out.println(count+1);
    }
}
