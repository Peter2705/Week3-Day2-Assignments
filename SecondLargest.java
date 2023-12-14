package week3.day2.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {
		int[] arr=  {3, 2, 11, 4, 6, 7};
		List<Integer> large= new ArrayList<Integer>();
		for(int i=0; i<arr.length;i++) {
			large.add(arr[i]);
		}
		
		Collections.sort(large);
		System.out.println("the sorted list is : "+large);
		System.out.println("The second largest number is :"+(large.get(large.size()-2)));
	}

}
