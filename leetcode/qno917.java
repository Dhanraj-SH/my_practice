// https://leetcode.com/problems/reverse-only-letters/

// class Solution {
//     public String reverseOnlyLetters(String s) {
//         char[] sChar = s.toCharArray();
//         int i = 0;
//         int j = sChar.length - 1;
//         while(i<j){
//             char ch1 = sChar[i];
//             char ch2 = sChar[j];
//             boolean isChar1 = ((ch1 >= 'a' && ch1 <= 'z') || (ch1 >= 'A' && ch1 <= 'Z'));
//             boolean isChar2 = ((ch2 >= 'a' && ch2 <= 'z') || (ch2 >= 'A' && ch2 <= 'Z'));

//             if(!isChar1) i++;
//             else if(!isChar2) j--;
//             else{
//                 sChar[i] = ch2;
//                 sChar[j] = ch1;
//                 i++;
//                 j--;            
//             }
//         }
//         return new String(sChar);
//     }
// }