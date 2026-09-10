// https://leetcode.com/problems/generate-parentheses/

// class Solution {
//     public List<String> generateParenthesis(int n) {
//         List<String> combinations = new ArrayList();
//         combinationGenerator(n, 0, 0, new StringBuilder(), combinations);
//         return combinations;       
//     }

//     static void combinationGenerator(int n, int open, int close, StringBuilder generator, List<String> combinations){
//         if(open == n && close == n){
//             combinations.add(generator.toString());
//         }

//         if(open < n){
//             generator.append('(');
//             combinationGenerator(n, open+1, close, generator, combinations);
//             generator.deleteCharAt(generator.length() - 1);
//         }

//         if(close < open){
//             generator.append(')');
//             combinationGenerator(n, open, close+1, generator, combinations);
//             generator.deleteCharAt(generator.length() - 1);
//         }
//     }
// }