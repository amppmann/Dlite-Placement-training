import java.util.*;

public class sort_median {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0 ; i < a.length ; i++){
            a[i] = sc.nextInt();
        }
        sort_median i1 = new sort_median();  
        System.out.println("\nBefore sorting array elements are - "); 
        i1.printArr(a);  
        i1.sort(a);  
        System.out.println("\n\nAfter sorting array elements are - ");
        i1.printArr(a);  
        System.out.println("\n\nMedian element is - ");
        i1.median(a);
        System.out.println(); 
    } 
    void sort(int a[]){
        int i,j,temp;
        int n = a.length;
        for(i = 1 ; i < n ; i++){
            for(j = i-1 ; j > 0 ; j--){
                if(a[j] < a[j-1]){
                    temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }
            }
        }
    }
    void median(int a[]){
        int med = 0;
        int n = a.length;
        for(int k = 0 ; k < n ; k++){
            if(n%2==1)
            {
                med=a[(n+1)/2-1];
            }else{
                med=(a[n/2-1]+a[n/2])/2;
            }
        }
        System.out.println(med);
    }
    void printArr(int a[]) 
    {  
        int i;  
        int n = a.length;  
        for (i = 0; i < n; i++)  
            System.out.print(a[i] + " ");  
    } 
}
