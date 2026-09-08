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
//      * Complete the 'findTaskPairForSlot' function below.
//      *
//      * The function is expected to return an INTEGER_ARRAY.
//      * The function accepts following parameters:
//      *  1. INTEGER_ARRAY taskDurations
//      *  2. INTEGER slotLength
//      */

//     public static List<Integer> findTaskPairForSlot( List<Integer> taskDurations, int slotLength) {

//         Map<Integer, Integer> map = new HashMap<>();

//         for (int i = 0; i < taskDurations.size(); i++) {

//             int current = taskDurations.get(i);
//             int needed = slotLength - current;

//             if (map.containsKey(needed)) {
//                 return List.of(map.get(needed), i);
//             }

//             map.put(current, i);
//         }

//         return List.of(-1, -1);
//     }
// }

// public class Solution_15 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

//         int taskDurationsCount = Integer.parseInt(bufferedReader.readLine().trim());

//         List<Integer> taskDurations = IntStream.range(0, taskDurationsCount).mapToObj(i -> {
//             try {
//                 return bufferedReader.readLine().replaceAll("\\s+$", "");
//             } catch (IOException ex) {
//                 throw new RuntimeException(ex);
//             }
//         })
//             .map(String::trim)
//             .map(Integer::parseInt)
//             .collect(toList());

//         int slotLength = Integer.parseInt(bufferedReader.readLine().trim());

//         List<Integer> result = Result.findTaskPairForSlot(taskDurations, slotLength);

//         System.out.println(
//             result.stream()
//                 .map(Object::toString)
//                 .collect(joining("\n"))
//         );

//         bufferedReader.close();
//     }
// }