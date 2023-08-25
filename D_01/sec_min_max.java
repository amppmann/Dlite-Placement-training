import java.util.*;

public class sec_min_max{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int min = 0;
        for(int i=0 ; i<n ; i++){
            int num = sc.nextInt();
            if(num > max){
                max = num;
            }else{
                min = num;
            }
        }
        System.out.println("Max ele "+max);
        System.out.println("Min ele "+min);
    }
}