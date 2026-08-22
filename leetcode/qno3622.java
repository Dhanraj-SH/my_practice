// https://leetcode.com/problems/check-divisibility-by-digit-sum-and-product/

// class Solution {
//     public boolean checkDivisibility(int n) {
//         int sum = sumDigits(n);
//         int mul = mulDigits(n);
//         return n % (sum + mul) == 0;
//     }

//     public static int sumDigits(int n) {
//         int sum = 0;
//         while (n > 0) {
//             sum += n % 10;
//             n /= 10;
//         }
//         return sum;
//     }

//     public static int mulDigits(int n) {
//         int mul = 1;
//         while (n > 0) {
//             mul *= n % 10;
//             n /= 10;
//         }
//         return mul;
//     }
// }