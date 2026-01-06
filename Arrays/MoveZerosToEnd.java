
import java.util.Arrays;
import java.util.Scanner;

public class MoveZerosToEnd  extends AlgorithmTemplate{

    @Override
    public void better(int[] arr) {
        // TODO Auto-generated method stub
        
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
        
        bruteforce(arr);
    }
    
}