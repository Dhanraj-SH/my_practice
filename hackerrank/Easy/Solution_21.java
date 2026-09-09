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
//      * Complete the 'countIsolatedCommunicationGroups' function below.
//      *
//      * The function is expected to return an INTEGER.
//      * The function accepts following parameters:
//      *  1. 2D_INTEGER_ARRAY links
//      *  2. INTEGER n
//      */

//     public static int countIsolatedCommunicationGroups(List<List<Integer>> links, int n) {
//     // Write your code here
//         List<List<Integer>> graph = new ArrayList<>();
        
//         for(int i = 0; i<n; i++){
//             graph.add(new ArrayList<>());
//         }
        
//         for(List<Integer> i:links){
//             int a = i.get(0);
//             int b = i.get(1);
            
//             graph.get(a).add(b);
//             graph.get(b).add(a);
//         }
        
//         boolean[] visited = new boolean[n];
//         int count = 0;
//         for(int i = 0; i<n; i++){
//             if(!visited[i]){
//                 count++;
//                 dfs(i, graph, visited);
//             }
//         }
        
//         return count;
//     }
    
//     static void dfs(int node, List<List<Integer>> graph, boolean[] visited){
//         visited[node] = true;
        
//         for(int i : graph.get(node)){
//             if(!visited[i]){
//                 dfs(i, graph, visited);
//             }
//         }
//     }

// }

// public class Solution {
//     public static void main(String[] args) throws IOException {
//         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

//         int linksRows = Integer.parseInt(bufferedReader.readLine().trim());
//         int linksColumns = Integer.parseInt(bufferedReader.readLine().trim());

//         List<List<Integer>> links = new ArrayList<>();

//         IntStream.range(0, linksRows).forEach(i -> {
//             try {
//                 links.add(
//                     Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                         .map(Integer::parseInt)
//                         .collect(toList())
//                 );
//             } catch (IOException ex) {
//                 throw new RuntimeException(ex);
//             }
//         });

//         int n = Integer.parseInt(bufferedReader.readLine().trim());

//         int result = Result.countIsolatedCommunicationGroups(links, n);

//         System.out.println(result);

//         bufferedReader.close();
//     }
// }