// import java.io.*;
// import java.math.*;
// import java.security.*;
// import java.text.*;
// import java.util.*;
// import java.util.concurrent.*;
// import java.util.function.*;
// import java.util.regex.*;
// import java.util.stream.*;
// import static java.util.stream.Collectors.joining;
// import static java.util.stream.Collectors.toList;

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
//      * Complete the 'deleteDuplicates' function below.
//      *
//      * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
//      * The function accepts INTEGER_SINGLY_LINKED_LIST head as parameter.
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

//     public static SinglyLinkedListNode deleteDuplicates(SinglyLinkedListNode head) {
//     // Write your code here
//         SinglyLinkedListNode cur = head;
        
//         while(cur != null && cur.next != null){
//             if(cur.data == cur.next.data){
//                 cur.next = cur.next.next;
//             } else {
//                 cur = cur.next;
//             }
//         }
        
//         return head;
        
//     }

// }

// public class Solution_12 {
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

//         SinglyLinkedListNode result = Result.deleteDuplicates(head.head);

//         SinglyLinkedListPrintHelper.printList(result, "\n");
//         System.out.println();

//         bufferedReader.close();
//     }
// }
