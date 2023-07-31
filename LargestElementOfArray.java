package day4Assignment;
import java.util.*;

public class LargestElementOfArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int arr[]= new int[6];
		int max=0;
		int min =0;
		System.out.println("Enter the array elements");
		for(int i =0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
	
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");	
		
		}
		
		for(int i =1;i<arr.length;i++) {
			max =arr[0];
			if(arr[i]>max) {
				max = arr[i];
				
			}
			min = arr[0];
			if(arr[i]<min) {
				min = arr[i];
			}
		}
			System.out.println();
			System.out.println("The maximum element of the aray is"+" "+max);
			System.out.println("The minimum element of the aray is" +" "+min);
		

	}

}
