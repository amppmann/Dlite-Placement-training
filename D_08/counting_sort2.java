import java.io.*;
import java.util.*;

public class counting_sort2 {

    public static List<Integer> countingSort(List<Integer> arr) {
        int maxVal = Collections.max(arr);
        int[] countArray = new int[maxVal + 1];

        for (int num : arr) {
            countArray[num]++;
        }

        List<Integer> sortedArray = new ArrayList<>();
        for (int i = 0; i < countArray.length; i++) {
            for (int j = 0; j < countArray[i]; j++) {
                sortedArray.add(i);
            }
        }

        return sortedArray;
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
                .collect(Collectors.joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
