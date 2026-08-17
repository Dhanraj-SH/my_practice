// https://leetcode.com/problems/first-unique-character-in-a-string/

// class Solution {
//     public int firstUniqChar(String s) {
//         Queue<Integer> q = new LinkedList<>();
//         int[] f = new int[26];
//         for(char ch: s.toCharArray()){
//             f[ch - 'a']++;
//         }

//         for(int i = 0; i<s.length(); i++){
//             q.add(i);
//         }

//         while(!q.isEmpty()){
//             if(f[s.charAt(q.peek())- 'a'] == 1){
//                 return q.peek();
//             }
//             q.poll();
//         }
//         return -1;
//     }
// }

// class Solution {
//     public int firstUniqChar(String s) {
//         int[] f = new int[26];
//         for(char ch: s.toCharArray()){
//             f[ch - 'a']++;
//         }

//         for(int i = 0; i<s.length(); i++){
//            if(f[s.charAt(i)- 'a'] == 1){
//                 return i;
//             }
//         }
//         return -1;
//     }
// }