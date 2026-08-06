// https://leetcode.com/problems/container-with-most-water/

// class Solution {
//     public int maxArea(int[] height) {
//         int max = 0;
//         int i = 0;
//         int j = height.length - 1;

//         while (i < j) {
//             int minHeight = Math.min(height[i], height[j]);
//             int width = j - i;
//             int area = minHeight * width;
//             max = Math.max(max, area);

//             if (height[i] < height[j]) {
//                 i++;
//             } else {
//                 j--;
//             }
//         }
//         return max;
//     }
// }