package week3.day2.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionList {

	public static void main(String[] args) {
		Integer[] arr= {3, 2, 11, 4, 6, 7};
		Integer[] arr1= {1, 2, 8, 4, 9, 7};
//	List<Integer> list1 = Arrays.stream(arr).boxed().toList();
//		List<Integer> list2 = Arrays.stream(arr1).boxed().toList();
//		
		//List<int[]> list1 = Arrays.asList(arr);
		
	List<Integer> list1= new ArrayList<Integer>(Arrays.asList(arr));
		List<Integer> list2= new ArrayList<Integer>(Arrays.asList(arr1));
//		
//		for(int i=0; i<arr.length;i++) {
//			list1.add(arr[i]);
//		}
//		
//		for(int i=0; i<arr1.length;i++) {
//			list2.add(arr1[i]);
//		}
		System.out.print("The numbers present in both the arrays are : ");
		for (int i=0; i<list1.size();i++) {
			for (int j=0; j<list2.size();j++) {
				if(list1.get(i)==list2.get(j)) {
					System.out.print(list1.get(i)+", ");
				}
			}
		}
		
	}

}
