import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'binarySearch' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY nums
     *  2. INTEGER target
     */

    public static int binarySearch(List<Integer> nums, int target) {
    // Write your code here
        if(nums == null || nums.isEmpty()) return -1;
        int i = 0;
        int j = nums.size() - 1 ;
        while(i<=j){
            int mid = i + (j - i) / 2;
            int n = nums.get(mid);
            if(n == target){
                return mid;
            } else if (n>target){
                j = mid - 1;
            } else {
                i = mid + 1; 
            }
        }
        return -1;
    }

}

public class Solution_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int numsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> nums = IntStream.range(0, numsCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int target = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.binarySearch(nums, target);

        System.out.println(result);

        bufferedReader.close();
    }
}
