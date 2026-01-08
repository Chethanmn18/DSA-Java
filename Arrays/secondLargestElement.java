
import java.util.Arrays;
import java.util.Scanner;

class SecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array length");
		int length = sc.nextInt();
		
		int[] arr = new int[length];
		
		
		System.out.println("Enter the arraay elements");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		bruteforce(arr);
		better(arr);
		optimal(arr);
		sc.close();
	}
	
	// Brute-force approach
	static void bruteforce(int[] arr) {
		int len = arr.length;
		
		
		int secondLargest = Integer.MIN_VALUE; // -1, if there is no second largest value in an array.
		
		Arrays.sort(arr);  // Time-complexity: N(logN)
		System.out.println(Arrays.toString(arr));
		
		int largest = arr[len-1];
		
		for(int i = arr.length - 1; i >= 0; i--) {   // Time-complexity: O(N)
			if(arr[i] != largest && arr[i] < largest) {
				secondLargest = arr[i];
				break; // to end the loop.
			}
		}
		System.out.println("Second Largest element in an array is " + secondLargest);
		
		// Total time complexity  = N(logN) + O(N).
	}
	
	//  Better Solution
	static void better(int[] arr) {
		int largest = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length; i++) { // Time-complexity: O(N)
			if(arr[i] > largest) {
				largest = arr[i];
			}
		}
		
		int secondLargest = -1;
		 for(int i = 0; i < arr.length; i++) {  // Time-complexity: O(N)
			 if(arr[i] > secondLargest && arr[i] != largest) {
				 secondLargest = arr[i];
			 }
		 }
		 
		 System.out.println("Second Largest element in an array is " + secondLargest);
		// Total time complexity  = O(N) + O(N).
	}
	
	
	//Optimal Solution
	
	static void optimal(int[] arr) {
		int largest = arr[0];
		int secondLargest = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			}
			else if(arr[i] < largest && arr[i] > secondLargest) {
				secondLargest = arr[i];
			}
		}
		System.out.println("Second Largest element in an array is " + secondLargest);
		// Total time complexity  = O(N)
	}

}
