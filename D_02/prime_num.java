import java.util.*;

public class prime_num {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n <= 2){
            System.out.println("Prime");
            return;
        }
        for(int i = 2 ; i <= n ; i++){
            if(n % 2 == 0)
            {
                System.out.println("Not Prime");
                break;
            }else{
                System.out.println("Prime");
                break;
            }
        }
    }
}
