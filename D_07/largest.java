import java.util.*;

public class largest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int max = 0;
        System.out.println("Enter the total number of element : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements : ");
        for(int i = 0 ; i < n ; i++){
            int val = sc.nextInt();
            if(val > max){
                max = val;
            }
        }
        System.out.println("Largest element is "+max);
    }    
}
