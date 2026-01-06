import java.util.Scanner;

public class isArraySorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array length");
		int length = sc.nextInt();
		
		int[] arr = new int[length];
		
		
		System.out.println("Enter the array elements");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		optimal(arr);
	}
	
	static void optimal(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] >= arr[i - 1]) {
				continue;
			}
			else {
				System.out.println("Array is not sorted.");
				return;
			}
		}
		System.out.println("Array is sorted.");
	}
}
