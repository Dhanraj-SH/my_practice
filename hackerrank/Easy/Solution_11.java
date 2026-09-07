package Easy;
// import java.io.*;
// import java.util.*;
// import java.util.stream.*;
// import static java.util.stream.Collectors.toList;



// class Result {

//     /*
//      * Complete the 'countAffordablePairs' function below.
//      *
//      * The function is expected to return an INTEGER.
//      * The function accepts following parameters:
//      *  1. INTEGER_ARRAY prices
//      *  2. INTEGER budget
//      */

//     public static int countAffordablePairs(List<Integer> prices, int budget) {
//     // Write your code here
    
//         int i = 0;
//         int j = prices.size() - 1;
//         int count = 0;
//         while(i<j){
//             long n = prices.get(i) + prices.get(j);
//             if(n <= budget){
//                 count += (j - i); 
//                 i++;
//             }else if(n>budget){
//                 j--;
//             }
//         }
//         return count;
//     }

// }

// public class Solution_11 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

//         int pricesCount = Integer.parseInt(bufferedReader.readLine().trim());

//         List<Integer> prices = IntStream.range(0, pricesCount).mapToObj(i -> {
//             try {
//                 return bufferedReader.readLine().replaceAll("\\s+$", "");
//             } catch (IOException ex) {
//                 throw new RuntimeException(ex);
//             }
//         })
//             .map(String::trim)
//             .map(Integer::parseInt)
//             .collect(toList());

//         int budget = Integer.parseInt(bufferedReader.readLine().trim());

//         int result = Result.countAffordablePairs(prices, budget);

//         System.out.println(result);

//         bufferedReader.close();
//     }
// }