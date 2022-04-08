import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		// 1. reverse array

				int[] arr1 = { 1, 2, 3, 2, 2, 7, 9, 7 };
				
				for (int i = 0; i < arr1.length / 2; i++) {
					int var = arr1[i];
					arr1[i] = arr1[arr1.length - 1 - i];
					arr1[arr1.length - 1 - i] = var;
				}
				System.out.println(Arrays.toString(arr1));

		// 2. find max/min in array

				int[] arr2 = { 1, 2, 3, 2, 2, 7, 9, 7 };
				
				int max = arr2[0], min = arr2[0];
				
				for (int b : arr2) {
					if (min > b) {
						min = b;
					}
					if (max < b) {
						max = b;
					}
				}
				System.out.println("min = " + min + "\n" + "max = " + max);

		// 3.find duplicates

				int[] arr3 = { 1, 2, 3, 2, 2, 7, 9, 7 };

				Set<Integer> set = new HashSet<>();

				for (int i = 0; i < arr3.length; i++) {
					int occurrence = 1;
					for (int j = i + 1; j < arr3.length; j++) {
						if (arr3[i] == arr3[j]) {
							occurrence++;
						}
					}
					if (occurrence > 1 && !set.contains(arr3[i])) {
						set.add(arr3[i]);
						System.out.println("no " + arr3[i] + " is duplicated. No of entries: " + occurrence);
						occurrence = 1;
					}
				}


	}

}
