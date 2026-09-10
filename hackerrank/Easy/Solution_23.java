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
//      * Complete the 'hasCircularDependency' function below.
//      *
//      * The function is expected to return a BOOLEAN.
//      * The function accepts following parameters:
//      *  1. INTEGER n
//      *  2. 2D_INTEGER_ARRAY dependencies
//      */

//     public static boolean hasCircularDependency(int n, List<List<Integer>> dependencies) {
//     // Write your code here
//         List<List<Integer>> graph = new ArrayList<>();
        
//         for(int i = 0; i<n; i++){
//             graph.add(new ArrayList<>());
//         }
        
//         for(List<Integer> i: dependencies){
//             int u = i.get(0);
//             int v = i.get(1);
            
//             graph.get(u).add(v);
//         }
        
//         boolean[] visited = new boolean[n];
//         boolean[] path = new boolean[n];
        
//         for(int i = 0; i<n; i++){
//             if(!visited[i]){
//                 if(dfs(i, graph, visited, path)){
//                     return true;
//                 }
//             }
//         }
        
//         return false;
//     }

//     static boolean dfs(int node, List<List<Integer>> graph, boolean[] visited, boolean[] path){
//         visited[node] = true;
//         path[node] = true;
        
//         for(int next: graph.get(node)){
//             if(path[next]){
//                 return true;
//             }
            
//             if(!visited[next]){
//                 if(dfs(next, graph, visited, path)){
//                     return true;
//                 }
//             }
//         }
        
//         path[node] = false;
        
//         return false; 
//     } 
// }

// public class Solution {
//     public static void main(String[] args) throws IOException {
//         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

//         int n = Integer.parseInt(bufferedReader.readLine().trim());

//         int dependenciesRows = Integer.parseInt(bufferedReader.readLine().trim());
//         int dependenciesColumns = Integer.parseInt(bufferedReader.readLine().trim());

//         List<List<Integer>> dependencies = new ArrayList<>();

//         IntStream.range(0, dependenciesRows).forEach(i -> {
//             try {
//                 dependencies.add(
//                     Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                         .map(Integer::parseInt)
//                         .collect(toList())
//                 );
//             } catch (IOException ex) {
//                 throw new RuntimeException(ex);
//             }
//         });

//         boolean result = Result.hasCircularDependency(n, dependencies);

//         System.out.println(result ? 1 : 0);

//         bufferedReader.close();
//     }
// }