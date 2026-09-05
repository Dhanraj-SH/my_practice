// https://leetcode.com/problems/excel-sheet-column-number/

// class Solution {
//     public int titleToNumber(String columnTitle) {
//         int val = 0;
//         for(int i = 0; i < columnTitle.length(); i++){
//             char ch = columnTitle.charAt(i);
//             val = val * 26 + (ch - 'A' + 1);
//         }
//         return val;
//     }
// }