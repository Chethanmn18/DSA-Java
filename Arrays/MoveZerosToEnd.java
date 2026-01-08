
import java.util.Arrays;
import java.util.Scanner;

public class MoveZerosToEnd  extends AlgorithmTemplate{

    @Override
    public void better(int[] arr) {
        // TODO Auto-generated method stub
        System.out.println("Beter solution doesn't exist for this one.");
    }

    @Override
    public void bruteforce(int[] arr) {
        // TODO Auto-generated method stub


        /*
     * Approach:
     * 1. Create a temporary array to store all non-zero elements.
     * 2. Traverse the original array and copy non-zero elements into temp.
     * 3. Copy all elements from temp back into the original array.
     *    (Remaining positions will automatically be zeros)
     *
     * Time Complexity:
     * - O(n): One traversal to collect non-zero elements
     * - O(n): One traversal to copy back
     * - Overall: O(n)
     *
     * Space Complexity:
     * - O(n): Extra array is used
     *
     * Note:
     * - This solution is NOT in-place.
     */
        int n = arr.length;

        int[] temp = new int[n]; 

        int j = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] != 0) {
                temp[j] = arr[i];
                j++;
            }
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }

        System.out.println(Arrays.toString(arr));
        
    }

    @Override
    public void optimal(int[] arr) {
        // TODO Auto-generated method stub

        /*
     * Approach (Two Pointer Technique):
     * 1. Find the index of the first zero element (pointer j).
     * 2. Traverse the array from j+1.
     * 3. Whenever a non-zero element is found, swap it with arr[j]
     *    and increment j.
     *
     * This ensures that all non-zero elements are shifted forward
     * while maintaining their relative order.
     *
     * Time Complexity:
     * - O(n): Array is traversed at most twice
     *
     * Space Complexity:
     * - O(1): No extra space is used (in-place solution)
     */


        int n = arr.length;
        
        int j = -1;
        for(int i = 0; i < n; i++){ // finding first non zero element index. 
            if(arr[i] == 0) {    // time complexity: O(x)
                j = i;
                break;
            }
        }

        if(j == -1) {
            System.out.println("There is no zero element the array.");
        }

        for(int i = j + 1; i < n; i++) { 
            if(arr[i] != 0) {
                //swap the elements of the array with jth index element 
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }// Time COmplexity: O(n-x)
        }
        System.out.println(Arrays.toString(arr));
        // Total time complexity: O(x) + O(n-x) = O(n)
    }

    @Override
    public void readInput() {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Array length");
        int n = sc.nextInt();

        int[] arr = new int[n];


        System.out.println("Enter the array elements");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        optimal(arr);
    }
    
}