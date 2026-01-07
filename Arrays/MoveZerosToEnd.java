
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
        int n = arr.length;

        int[] temp = new int[n]; 

        int j = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] != 0) {
                temp[j] = arr[i];
                j++;
            }
        }

        for(int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }

        System.out.println(Arrays.toString(arr));
        
    }

    @Override
    public void optimal(int[] arr) {
        // TODO Auto-generated method stub
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