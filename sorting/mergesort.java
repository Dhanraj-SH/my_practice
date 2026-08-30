import java.util.Scanner;

class mergesort{

    static void mergeSort(int[] arr, int left, int right){
        
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = in.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = in.nextInt();
        }

        mergeSort(arr,0,n-1);
    }
}