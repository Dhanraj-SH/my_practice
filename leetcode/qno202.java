// https://leetcode.com/problems/happy-number/description/

// class Solution {
//     public boolean isHappy(int n) {
//         while(n!=1&& n!=4){
//             int sum=0;
//             while(n>0){
//                 int digit=n%10;
//                 sum+=digit*digit;
//                 n=n/10;
//             }
//             n=sum;
//         }
//         return n==1;
//     }
// }

// // class Solution {
//     public boolean isHappy(int n) {
//         int slow = n, fast = n;
//         do {
//             slow = sumOfSquares(slow);
//             fast = sumOfSquares(sumOfSquares(fast));
//         } while (slow != fast);
//         return slow == 1;
//     }
//     private int sumOfSquares(int n) {
//         int squareSum = 0;
//         while (n > 0) {
//             int r = n % 10;
//             n = n / 10;
//             squareSum += r * r;
//         }
//         return squareSum;
//     }
// }