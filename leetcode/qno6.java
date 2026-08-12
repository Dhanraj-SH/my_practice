// https://leetcode.com/problems/zigzag-conversion/

// class Solution {
//     public String convert(String s, int numRows) {
//         if (numRows == 1 || s.length() <= numRows) return s;
        
//         char[] arr = s.toCharArray();
//         int size = s.length();
//         StringBuilder sb = new StringBuilder();
        
//         int cycleLen = 2 * numRows - 2; 

//         for (int i = 0; i < numRows; i++) {
//             for (int j = i; j < size; j += cycleLen) {
//                 sb.append(arr[j]);
                
//                 if (i != 0 && i != numRows - 1) {
//                     int diagonalIndex = j + cycleLen - 2 * i;
//                     if (diagonalIndex < size) {
//                         sb.append(arr[diagonalIndex]);
//                     }
//                 }
//             }
//         }
        
//         return sb.toString();
//     }
// }
