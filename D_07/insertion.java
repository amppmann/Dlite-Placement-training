import java.util.*;

public class insertion{  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0 ; i < a.length ; i++){
            a[i] = sc.nextInt();
        }
        insertion i1 = new insertion();  
        System.out.println("\nBefore sorting array elements are - "); 
        i1.printArr(a);  
        i1.insert(a);  
        System.out.println("\n\nAfter sorting array elements are - ");
        i1.printArr(a);  
        System.out.println();  
    }  
    // void insert(int a[]) 
    // {  
        // int i, j, temp;  
        // int n = a.length;  
        // for (i = 1; i < n; i++) {  
            // temp = a[i];  
            // j = i - 1;  
            // while(j>=0 && temp <= a[j])  
            // {    
                // a[j+1] = a[j];     
                // j = j-1;    
            // }    
            // a[j+1] = temp;    
        // }  
    // }  
    void insert(int a[]){
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
    void printArr(int a[]) 
    {  
        int i;  
        int n = a.length;  
        for (i = 0; i < n; i++)  
            System.out.print(a[i] + " ");  
    }
}  