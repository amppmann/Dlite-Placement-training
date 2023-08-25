import java.io.*;
import java.util.*;

public class counting_sort {

    public static List<Integer> countingSort(List<Integer> arr) {
        int n = arr.size();
        int[] count = new int[n];
        
        for (int i : arr) {
            count[i]++;
        }
        
        List<Integer> result = new ArrayList<>();
        for (int num : count) {
            result.add(num);
        }
        
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = new ArrayList<>();
        String[] arrItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr.add(arrItem);
        }

        List<Integer> result = countingSort(arr);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
