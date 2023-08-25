import java.util.Scanner;

public class plaindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        int x = sc.nextInt();
        int num = x;
        int digit = 0;
        int rev = 0;
        while(x > 0)
        {
            int remainder = x % 10;  
            rev = rev * 10 + remainder;  
            x = x/10;  
        }
        if(rev == num){
            System.out.println("Pallindrome");
        }else{
            System.out.println("Not Pallindrome");
        }
    }
}
