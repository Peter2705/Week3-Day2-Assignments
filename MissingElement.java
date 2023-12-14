package week3.day2.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,10,6,8};
		List<Integer> arrange= new ArrayList<Integer>();
		for (int i=0;i<arr.length;i++) {
			arrange.add(arr[i]);
		}
		Collections.sort(arrange);
		System.out.println("The sorted list is :"+arrange);
		System.out.print("The missing elements are: ");
		for (int i = arrange.get(0); i < arrange.get(arrange.size()-1); i++) {
			
			if (!arrange.contains(i)) {
				System.out.print(i+", ");
			}
			
		}

		
	}

}
