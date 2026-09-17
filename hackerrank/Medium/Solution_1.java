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
//      * Complete the 'mergeHighDefinitionIntervals' function below.
//      *
//      * The function is expected to return a 2D_INTEGER_ARRAY.
//      * The function accepts 2D_INTEGER_ARRAY intervals as parameter.
//      */

//     public static List<List<Integer>> mergeHighDefinitionIntervals(List<List<Integer>> intervals) {
//     // Write your code here
//         List<List<Integer>> merged = new ArrayList<>();
//         int n = intervals.size();
//         if(n == 0){
//             return merged;
//         }
        
//         intervals.sort((a,b) -> Integer.compare(a.get(0), b.get(0)));
        
//         merged.add(new ArrayList<>(intervals.get(0)));
        
//         for(int i = 1; i< n; i++){
//             List<Integer> curr = intervals.get(i);
//             List<Integer> last = merged.get(merged.size() - 1);
            
//             int start = curr.get(0);
//             int end = curr.get(1);
            
//             int lastEnd = last.get(1);
            
//             if(start <= lastEnd){
//                 last.set(1, Math.max(lastEnd, end));
//             } else {
//                 merged.add(new ArrayList<>(curr));
//             }
//         }
//         return merged;
//     }

// }

// public class Solution_1 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

//         int intervalsRows = Integer.parseInt(bufferedReader.readLine().trim());
//         int intervalsColumns = Integer.parseInt(bufferedReader.readLine().trim());

//         List<List<Integer>> intervals = new ArrayList<>();

//         IntStream.range(0, intervalsRows).forEach(i -> {
//             try {
//                 intervals.add(
//                     Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                         .map(Integer::parseInt)
//                         .collect(toList())
//                 );
//             } catch (IOException ex) {
//                 throw new RuntimeException(ex);
//             }
//         });

//         List<List<Integer>> result = Result.mergeHighDefinitionIntervals(intervals);

//         result.stream()
//             .map(
//                 r -> r.stream()
//                     .map(Object::toString)
//                     .collect(joining(" "))
//             )
//             .collect(toList())
//             .forEach(System.out::println);

//         bufferedReader.close();
//     }
// }