package week3.day2.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingCollection {

	public static void main(String[] args) {
		String[] arr={"HCL", "Wipro", "Aspire Systems", "CTS"};
		List<String> sorting=new ArrayList<String>();
		for (int i=0; i<arr.length;i++) {
			sorting.add(arr[i]);
		}
		Collections.sort(sorting);
		for(int i=sorting.size()-1;i>=0;i--) {
			System.out.println(sorting.get(i));
		}
		


	}

}
