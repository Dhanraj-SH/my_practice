// https://leetcode.com/problems/letter-combinations-of-a-phone-number/

// class Solution {
//     public List<String> letterCombinations(String digits) {
//         String[] letters = {
//             "",
//             "",
//             "abc",
//             "def",
//             "ghi",
//             "jkl",
//             "mno",
//             "pqrs",
//             "tuv",
//             "wxyz"
//         };

//         List<String> result = new ArrayList();
//         combinationGenerator(digits, 0, result, new StringBuilder(), letters);
//         return result;
//     }

//     static void combinationGenerator(String digits, int i, List<String> result, StringBuilder combination, String[] letters){
//         if(i == digits.length()){
//             result.add(combination.toString());
//             return;
//         }

//         String characters = letters[digits.charAt(i)-'0'];

//         for(int j = 0; j<characters.length(); j++){
//             combination.append(characters.charAt(j));
//             combinationGenerator(digits, i+1, result, combination, letters);
//             combination.deleteCharAt(combination.length() - 1);
//         }
//     }
// }