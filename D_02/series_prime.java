import java.util.*;

public class series_prime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Nth number : ");
        int u = sc.nextInt();
        for (int i = 2; i <= u; i++){
            if (Prime (i)){
                System.out.println (i);   
            }
        }
    }
    static boolean Prime(int n)
    {
        int count = 0;
        if(n < 2){
            return false;
        }
        for(int i = 2 ; i < n/2 ; i++){
            if(n % i== 0){
                return false;
            }
        }
        return true;
    }
}

