import java.util.Arrays;

public class ArraySorter {
	public static void main (String args[]) {
		ArraySorter as = new ArraySorter();
		int array1[] = {3,4,2,5};
		
		as.sortArray(array1);
		
		for (int i = 0; i <= array1.length-1; i++) {
			System.out.println(array1[i]);
		}
	}
	
	public void sortArray (int arr[]) {
		Arrays.sort(arr);
	}
}
