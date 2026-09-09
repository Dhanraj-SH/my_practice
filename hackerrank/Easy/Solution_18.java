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
//      * Complete the 'canPlaceSecurityCameras' function below.
//      *
//      * The function is expected to return a BOOLEAN.
//      * The function accepts following parameters:
//      *  1. INTEGER N
//      *  2. 2D_INTEGER_ARRAY grid
//      */

//     public static boolean canPlaceSecurityCameras(int N, List<List<Integer>> grid) {
//     // Write your code here
//         boolean camera[][] = new boolean[N][N];
        
//         return solve(0,N,camera, grid);
//     }
    
//     public static boolean solve(int row, int N, boolean[][] camera, List<List<Integer>> grid){
//         if(row == N){
//             return true;
//         }
        
//         for(int col = 0; col<N; col++){
//             if(grid.get(row).get(col) == 1){
//                 continue;
//             }
//             if(!isSafe(row, col, N, camera)){
//                 continue;
//             }
            
//             camera[row][col] = true;
//             if(solve(row+1, N, camera, grid)){
//                 return true;
//             }
            
//             camera[row][col] = false;
//         }
        
//         return false;
//     }
    
//     static boolean isSafe(int row, int col, int N, boolean[][] camera){
//         for(int i = 0; i< row; i++){
//             if(camera[i][col]){
//                 return false;
//             }
//         }
        
//         int r = row - 1;
//         int c = col - 1;
        
//         while(r >= 0 && c >= 0){
//             if(camera[r][c]){
//                 return false;
//             }
//             r--;
//             c--;
//         }
        
//         r = row - 1;
//         c = col + 1;
        
//         while(r >= 0 && c <N){
//             if(camera[r][c]){
//                 return false;
//             }
//             r--;
//             c++;
//         }
        
//         return true;
//     }

// }

// public class Solution {
//     public static void main(String[] args) throws IOException {
//         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

//         int N = Integer.parseInt(bufferedReader.readLine().trim());

//         int gridRows = Integer.parseInt(bufferedReader.readLine().trim());
//         int gridColumns = Integer.parseInt(bufferedReader.readLine().trim());

//         List<List<Integer>> grid = new ArrayList<>();

//         IntStream.range(0, gridRows).forEach(i -> {
//             try {
//                 grid.add(
//                     Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                         .map(Integer::parseInt)
//                         .collect(toList())
//                 );
//             } catch (IOException ex) {
//                 throw new RuntimeException(ex);
//             }
//         });

//         boolean result = Result.canPlaceSecurityCameras(N, grid);

//         System.out.println(result ? 1 : 0);

//         bufferedReader.close();
//     }
// }
