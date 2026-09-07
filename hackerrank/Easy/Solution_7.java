package Easy;
// import java.io.*;
// import java.util.*;
// import java.util.stream.*;
// import static java.util.stream.Collectors.toList;



// class Result {

//     /*
//      * Complete the 'maximizeNonOverlappingMeetings' function below.
//      *
//      * The function is expected to return an INTEGER.
//      * The function accepts 2D_INTEGER_ARRAY meetings as parameter.
//      */

//     public static int maximizeNonOverlappingMeetings(List<List<Integer>> meetings) {
//     // Write your code here
//         meetings.sort((a, b) -> Integer.compare(a.get(1), b.get(1)));
        
//         int count = 0;
//         int lastEnd = Integer.MIN_VALUE;
        
//         for(List<Integer> i: meetings){
//             int start = i.get(0);
//             int end = i.get(1);
//             if(start >= lastEnd){
//                 count++;
//                 lastEnd = end;
//             }
//         }
        
//         return count;
//     }

// }

// public class Solution_7 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

//         int meetingsRows = Integer.parseInt(bufferedReader.readLine().trim());
//         int meetingsColumns = Integer.parseInt(bufferedReader.readLine().trim());

//         List<List<Integer>> meetings = new ArrayList<>();

//         IntStream.range(0, meetingsRows).forEach(i -> {
//             try {
//                 meetings.add(
//                     Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                         .map(Integer::parseInt)
//                         .collect(toList())
//                 );
//             } catch (IOException ex) {
//                 throw new RuntimeException(ex);
//             }
//         });

//         int result = Result.maximizeNonOverlappingMeetings(meetings);

//         System.out.println(result);

//         bufferedReader.close();
//     }
// }
