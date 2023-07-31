package day4Assignment;
import java.util.*;

public class FrequencyOfElements {
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int arr[]= new int[5];
		int arrNew []= new int[arr.length];
		int visited  = -1;
		System.out.println("Enter the array elements");
		for(int i =0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
				
			
				for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");	
			System.out.println();
		
		}
		for(int i =0;i<arr.length;i++) {
			 int freq =1;
			for(int j=i+1;j<arr.length;j++) {
				
			
			
				if(arr[i]==arr[j]) {
					freq++;
					arrNew[j]= visited;
				}
					
				}
			
			if(arrNew[i]!= visited) {
				arrNew[i] =freq;
			}
	}
		
		for(int i =0;i<arrNew.length;i++) {
			if(arrNew[i]!=visited)
			System.out.println(arr[i]+" "+ arrNew[i]);
		}
		}	


	}


