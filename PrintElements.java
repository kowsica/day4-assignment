package day4Assignment;
import java.util.*;

public class PrintElements {

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
	}

}
