// https://leetcode.com/problems/valid-anagram/

// class Solution {
//     public boolean isAnagram(String s, String t) {
//         HashMap<Character, Integer> smap = new HashMap<>();

//         for(int i = 0; i<s.length(); i++){
//             char schar = s.charAt(i);
//             smap.put(schar, smap.getOrDefault(schar, 0) + 1);
//         }

//         for(int i=0; i<t.length(); i++){
//             char tchar = t.charAt(i);
//             if(!smap.containsKey(tchar)){
//                 return false;
//             }
//             smap.put(tchar, smap.get(tchar)-1);

//             if(smap.get(tchar)==0){
//                 smap.remove(tchar);
//             }
//         }
//         return smap.isEmpty();
//     }
// }


// class Solution {
//     public boolean isAnagram(String s, String t) {
//         char[] sArray = s.toCharArray();
//         char[] tArray = t.toCharArray();
//         Arrays.sort(sArray);
//         Arrays.sort(tArray);
//         if(Arrays.equals(sArray,tArray)){
//             return true;
//         }
//         return false;
//     }
// }