import java.io.*;
import java.util.*;

public class simple_text {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        StringBuilder editorContent = new StringBuilder();
        Stack<String> operationStack = new Stack<>();
        for (int i = 0; i < q; i++) {
            int operationType = scanner.nextInt();
            switch (operationType) {
                case 1:
                    operationStack.push(editorContent.toString());
                    String appendString = scanner.next();
                    editorContent.append(appendString);
                    break;
                case 2:
                    operationStack.push(editorContent.toString());
                    int deleteCount = scanner.nextInt();
                    editorContent.delete(editorContent.length() - deleteCount,editorContent.length());
                    break;
                case 3:
                    int printIndex = scanner.nextInt() - 1; 
                    System.out.println(editorContent.charAt(printIndex));
                    break;
                case 4:
                    if (!operationStack.isEmpty()) {
                        editorContent = new StringBuilder(operationStack.pop());
                    }
                    break;
                default:
                    break;
            }
        }
        scanner.close();
    }
}