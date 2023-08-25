import java.util.*;

public class max_min {
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i = 0 ; i < 10 ; i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 0 ;i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }else{
                min = arr[i];
            }
        }
        System.out.println("Max ele "+max);
        System.out.println("Min ele "+min);
    }
}
