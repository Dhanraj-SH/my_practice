// https://leetcode.com/problems/remove-duplicates-from-sorted-list/

// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//     public ListNode deleteDuplicates(ListNode head) {
//         ListNode sll = head;
//         while(sll != null && sll.next != null){
//             if(sll.val == sll.next.val){
//                 sll.next = sll.next.next;
//             } else {
//                 sll = sll.next;
//             }
//         }
//         return head;
//     }
// }