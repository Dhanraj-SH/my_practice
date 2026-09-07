// import java.io.*;
// import java.util.*;
// import java.util.stream.*;
// import static java.util.stream.Collectors.joining;
// import static java.util.stream.Collectors.toList;



// class Result {

//     /*
//      * Complete the 'processCouponStackOperations' function below.
//      *
//      * The function is expected to return an INTEGER_ARRAY.
//      * The function accepts STRING_ARRAY operations as parameter.
//      */

//     public static List<Integer> processCouponStackOperations( List<String> operations) {
//         List<Integer> list = new ArrayList<>();
//         Stack<Integer> stack = new Stack<>();
//         Stack<Integer> minStack = new Stack<>();

//         for (String s : operations) {
//             if (s.startsWith("push ")) {
//                 int n = Integer.parseInt(s.replace("push ", ""));
//                 stack.push(n);
//                 if (minStack.isEmpty() || n <= minStack.peek()) {
//                     minStack.push(n);
//                 }
//             } else if (s.equals("pop")) {
//                 if (minStack.peek().equals(stack.peek())) {
//                     minStack.pop();
//                 }
//                 stack.pop();
//             } else if (s.equals("getMin")) {
//                 list.add(minStack.peek());
//             } else if (s.equals("top")) {
//                 list.add(stack.peek());
//             }
//         }

//         return list;
//     }

// }

// public class Solution_10 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

//         int operationsCount = Integer.parseInt(bufferedReader.readLine().trim());

//         List<String> operations = IntStream.range(0, operationsCount).mapToObj(i -> {
//             try {
//                 return bufferedReader.readLine();
//             } catch (IOException ex) {
//                 throw new RuntimeException(ex);
//             }
//         })
//             .collect(toList());

//         List<Integer> result = Result.processCouponStackOperations(operations);

//         System.out.println(
//             result.stream()
//                 .map(Object::toString)
//                 .collect(joining("\n"))
//         );

//         bufferedReader.close();
//     }
// }
