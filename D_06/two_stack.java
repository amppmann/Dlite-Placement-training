import java.util.*;

public class two_stack {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        for (int i = 0; i < q; i++) {
            int queryType = scanner.nextInt();
            if (queryType == 1) {
                int x = scanner.nextInt();
                stack1.push(x);
            } else if (queryType == 2) {
                if (stack2.isEmpty()) {
                    while (!stack1.isEmpty()) {
                        stack2.push(stack1.pop());
                    }
                }
                if (!stack2.isEmpty()) {
                    stack2.pop();
                }
            } else if (queryType == 3) {
                if (stack2.isEmpty()) {
                    while (!stack1.isEmpty()) {
                        stack2.push(stack1.pop());
                    }
                }
                if (!stack2.isEmpty()) {
                    System.out.println(stack2.peek());
                }
            }
        }
        scanner.close();
    }
}

