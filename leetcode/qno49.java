// https://leetcode.com/problems/group-anagrams/

// class Solution {
//     public String frequencykey(String word){
//         int[] count = new int[26];

//         for(char ch:word.toCharArray()){
//             count[ch - 'a']++;
//         }

//         StringBuilder sb = new StringBuilder();
//         for(int i=0; i<26; i++){
//             if(count[i]!=0){
//                 sb.append((char)('a' + i)).append(count[i]);
//             }
//         }
//         return sb.toString();
//     }
//     public List<List<String>> groupAnagrams(String[] strs) {
//         HashMap<String, List<String>> smap = new HashMap<>();

//         for(String words: strs){
//             String key = frequencykey(words);
//             if(!smap.containsKey(key)){
//                 smap.put(key, new ArrayList<>());
//             }
//             smap.get(key).add(words);
//         }
//         return new ArrayList<>(smap.values());
//     }
// }