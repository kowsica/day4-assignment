package day4Assignment;
import java.util.*;

public class EvenElements {
			public static void evenElements(int arr[]) {
			  
			System.out.println();
			System.out.println("The even elements are:");
				for(int i =1;i<arr.length;i=i+2) {
					
					System.out.println(arr[i]+" ");
					}
				}
				
			public static void oddElements(int arr[]) {
				  
				System.out.println();
				System.out.println("The odd elements are:");
					for(int i =0;i<arr.length;i=i+2) {
						
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
				
			System.out.println("The array elements are:");
				for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");	
			
			
				}
				EvenElements even = new EvenElements();
				
				even.evenElements(arr);
				
				even.oddElements(arr);
				
				
				

	} 

}
