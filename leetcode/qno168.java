// https://leetcode.com/problems/excel-sheet-column-title/

// class Solution {
//     public String convertToTitle(int columnNumber) {
//         StringBuilder s = new StringBuilder();
//         while(columnNumber > 0){
//             columnNumber--;
//             s.append((char)(columnNumber % 26 + 'A'));
//             columnNumber /= 26;
//         }

//         return s.reverse().toString();
//     }
// }