package in.co.vineet;

import java.util.Arrays;

public class Ch5Arrays {
	
	public static void main(String[] args) {
		
		int[] numbers = {10, 123,34, 3214, 234};
		//Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		System.out.println(numbers);
		
		for(int i : numbers) {
			System.out.println("Value :: "+ i);
		}
		
//		System.out.println(Arrays.binarySearch(numbers, 34));
//		System.out.println(Arrays.binarySearch(numbers, 11));
//		System.out.println(Arrays.binarySearch(numbers, 123));
//		System.out.println(Arrays.binarySearch(numbers, 1300));
//		System.out.println(Arrays.binarySearch(numbers, 234));
		
		System.out.println(Arrays.compare(new int[] {10,11}, new int[] {10,11,12}));
		System.out.println(Arrays.mismatch(new int[] {10,11,12}, new int[] {10,11,12}));
		
	}

}

