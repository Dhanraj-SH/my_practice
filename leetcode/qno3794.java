// https://leetcode.com/problems/reverse-string-prefix/

// class Solution {
//     public String reversePrefix(String s, int k) {
//         int n = s.length();
//         if(k == 0 || k == 1 || n<2 ) return s;

//         if(k != n){
//             k %= n;
//         }

//         char[] sArr = s.toCharArray();
//         int i = 0;
//         int j = k - 1;
//         while(i<j){
//             char temp = sArr[i];
//             sArr[i] = sArr[j];
//             sArr[j] = temp;
//             i++;
//             j--;
//         }

//         return new String(sArr);
//     }
// }