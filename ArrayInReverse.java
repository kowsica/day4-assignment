package day4Assignment;
import java.util.*;

public class ArrayInReverse {
	public static void reverseElements(int arr[]) {
		System.out.println();
		System.out.println("The elements in reverse order are:");
		for(int i= arr.length-1;i>=0;i--) {
			System.out.println(arr[i]+" ");
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int arr[]= new int[6];
		System.out.println("Enter the array elements");
		for(int i =0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
	
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");	
		
		}
		ArrayInReverse array = new ArrayInReverse();
		array.reverseElements(arr);
	}

}
