// import java.io.*;
// import java.util.stream.*;

// class SinglyLinkedListNode {
//     public int data;
//     public SinglyLinkedListNode next;

//     public SinglyLinkedListNode(int nodeData) {
//         this.data = nodeData;
//         this.next = null;
//     }
// }

// class SinglyLinkedList {
//     public SinglyLinkedListNode head;
//     public SinglyLinkedListNode tail;

//     public SinglyLinkedList() {
//         this.head = null;
//         this.tail = null;
//     }

//     public void insertNode(int nodeData) {
//         SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

//         if (this.head == null) {
//             this.head = node;
//         } else {
//             this.tail.next = node;
//         }

//         this.tail = node;
//     }
// }

// class SinglyLinkedListPrintHelper {
//     public static void printList(SinglyLinkedListNode node, String sep) {
//         while (node != null) {
//             System.out.print(node.data);

//             node = node.next;

//             if (node != null) {
//                 System.out.print(sep);
//             }
//         }
//     }
// }



// class Result {

//     /*
//      * Complete the 'removeKthNodeFromEnd' function below.
//      *
//      * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
//      * The function accepts following parameters:
//      *  1. INTEGER_SINGLY_LINKED_LIST head
//      *  2. INTEGER k
//      */

//     /*
//      * For your reference:
//      *
//      * SinglyLinkedListNode {
//      *     int data;
//      *     SinglyLinkedListNode next;
//      * }
//      *
//      */

//     public static SinglyLinkedListNode removeKthNodeFromEnd(SinglyLinkedListNode head, int k) {

//         SinglyLinkedListNode dummy = new SinglyLinkedListNode(0);
//         dummy.next = head;

//         SinglyLinkedListNode slow = dummy;
//         SinglyLinkedListNode fast = dummy;

//         for (int i = 0; i <= k; i++) {
//             if (fast.next == null) {
//                 return head;
//             }
//             fast = fast.next;
//         }

//         while (fast.next != null) {
//             slow = slow.next;
//             fast = fast.next;
//         }

//         slow.next = slow.next.next;

//         return dummy.next;
//     }

// }

// public class Solution_9 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

//         SinglyLinkedList head = new SinglyLinkedList();

//         int headCount = Integer.parseInt(bufferedReader.readLine().trim());

//         IntStream.range(0, headCount).forEach(i -> {
//             try {
//                 int headItem = Integer.parseInt(bufferedReader.readLine().trim());

//                 head.insertNode(headItem);
//             } catch (IOException ex) {
//                 throw new RuntimeException(ex);
//             }
//         });

//         int k = Integer.parseInt(bufferedReader.readLine().trim());

//         SinglyLinkedListNode result = Result.removeKthNodeFromEnd(head.head, k);

//         SinglyLinkedListPrintHelper.printList(result, "\n");
//         System.out.println();

//         bufferedReader.close();
//     }
// }
