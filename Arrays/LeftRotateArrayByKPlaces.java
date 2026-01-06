
import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateArrayByKPlaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of K");
        int k = sc.nextInt();

        System.out.println("Enter the array length");
        int n = sc.nextInt();

        System.out.println("Enter the array elements");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println(Arrays.toString(optimal(arr, k)));
        sc.close();
    }

    static int[] bruteforce(int[] arr, int k) {
        if(k == 0 || arr.length == 0) {
            return arr;
        }
        k = k % arr.length;

        int[] temp = new int[k];

        for(int i = 0; i < k; i++) {
            temp[i] = arr[i]; 
        }

        for(int i = k; i < arr.length; i++) {
            arr[i-k] = arr[i]; // placing the k+1 element to starting of the array.
        }

        for(int i = arr.length-k; i < arr.length; i++) {
            arr[i] = temp[i-(arr.length-k)];
        }
        return arr;
    }


    static int[] optimal(int[] arr, int k) {
        reverseArray(arr, 0, k-1);
        reverseArray(arr, k, arr.length-1);
        reverseArray(arr, 0, arr.length-1);
        return arr;
    }
    static int[] reverseArray(int[] arr, int start, int end) {

        while(start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        return arr;
    }
}
