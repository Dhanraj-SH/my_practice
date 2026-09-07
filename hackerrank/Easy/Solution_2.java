package Easy;
// import java.io.*;
// import java.math.*;
// import java.security.*;
// import java.text.*;
// import java.util.*;
// import java.util.concurrent.*;
// import java.util.function.*;
// import java.util.regex.*;
// import java.util.stream.*;
// import static java.util.stream.Collectors.joining;
// import static java.util.stream.Collectors.toList;



// class Result {

//     /*
//      * Complete the 'findSmallestMissingPositive' function below.
//      *
//      * The function is expected to return an INTEGER.
//      * The function accepts INTEGER_ARRAY orderNumbers as parameter.
//      */

//     public static int findSmallestMissingPositive(List<Integer> orderNumbers) {

//         int n = orderNumbers.size();

//         for (int i = 0; i < n; i++) {

//             int val = orderNumbers.get(i);

//             while (val > 0 && val <= n && orderNumbers.get(val - 1) != val) {

//                 int temp = orderNumbers.get(i);

//                 orderNumbers.set(i, orderNumbers.get(val - 1));
//                 orderNumbers.set(val - 1, temp);

//                 val = orderNumbers.get(i);
//             }
//         }

//         for (int i = 0; i < n; i++) {

//             if (orderNumbers.get(i) != i + 1) {
//                 return i + 1;
//             }
//         }

//         return n + 1;
//     }

// }

// public class Solution_2 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

//         int orderNumbersCount = Integer.parseInt(bufferedReader.readLine().trim());

//         List<Integer> orderNumbers = IntStream.range(0, orderNumbersCount).mapToObj(i -> {
//             try {
//                 return bufferedReader.readLine().replaceAll("\\s+$", "");
//             } catch (IOException ex) {
//                 throw new RuntimeException(ex);
//             }
//         })
//             .map(String::trim)
//             .map(Integer::parseInt)
//             .collect(toList());

//         int result = Result.findSmallestMissingPositive(orderNumbers);

//         System.out.println(result);

//         bufferedReader.close();
//     }
// }
