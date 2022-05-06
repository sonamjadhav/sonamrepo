package arraysPractice;

import java.util.Arrays;

public class printDuplicateElementsOfAnArray {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 1, 2, 3, 5, 6 };
		System.out.println("Print duplicate elements :");

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j])
					System.out.print(a[j]+" ");
			}
		}
		System.out.println();
		System.out.println("************************");
//Print the elements of an array
		System.out.println("Print the elements of an array");
		for (int c : a) {
			System.out.print(c + " ");
		}
		System.out.println();
		System.out.println("************************");
//Print the elements in reverse order
		System.out.println("Print the elements in reverse order");
		for (int k = a.length - 1; k >= 0; k--) {
			System.out.print(a[k] + " ");
		}
		System.out.println();
		System.out.println("************************");
//Print the elements present in even position
		System.out.println("Print the elements present in even position");
		for (int l = 1; l < a.length; l = l + 2) {
			System.out.print(a[l] + " ");
		}
		System.out.println();
		System.out.println("************************");
//Print the elements present in odd position
		System.out.println("Print the elements present in odd position");
		for (int l = 0; l < a.length; l = l + 2) {
			System.out.print(a[l] + " ");
		}
		System.out.println();
		System.out.println("************************");
//Print the largest element in an array
		System.out.println("Print the largest element in an array");

		int max = a[0];
		for (int m = 0; m < a.length; m++) {
			if (a[m] > max) {
				max = a[m];
			}
		}
		System.out.print(max + " ");
		System.out.println();
		System.out.println("************************");
		// Print the smallest element in an array
		System.out.println("Print the Smallest element in an array");

		int min = a[a.length - 1];
		for (int m = a.length - 1; m >= 0; m--) {
			if (a[m] < min) {
				min = a[m];
			}
		}
		System.out.print(min + " ");
		System.out.println();
		System.out.println("************************");
//Print the number of elements present in an array
		System.out.println("Print the number of elements present in an array");
		System.out.print(a.length);
		System.out.println();
		System.out.println("************************");
//Print the sum of all the items of the array
		System.out.println("Print the sum of all the items of the array");
		int sum = 0;
		for (int c : a) {
			sum = sum + c;
		}
		System.out.print(sum + " ");
		System.out.println();
		System.out.println("************************");
//To sort the elements of an array in ascending order
		System.out.println("Print the elements of an array in ascending order");
//		Arrays.sort(a);
//		for (int c : a) {
//			System.out.print(c + " ");
//		}

		for (int n = 0; n < a.length; n++) {
			for (int o = n + 1; o < a.length; o++) {
				if (a[n] > a[o]) {
					int temp = a[n];
					a[n] = a[o];
					a[o] = temp;
				}
			}
		}
		for (int n = 0; n < a.length; n++) {
			System.out.print(a[n] + " ");
		}
		System.out.println();
// Find 3rd largest number in an array
		System.out.println("Third largest number :" + a[a.length - 3]);
		System.out.println();
// Find 2nd largest number in an array
		System.out.println("Second largest number :" + a[a.length - 2]);
		System.out.println();
// Find largest number in an array
		System.out.println("largest number :" + a[a.length - 1]);
		System.out.println();
// Find 2nd smallest number in an array
		System.out.println("Second smallest number :" + a[1]);
		System.out.println();
// Find smallest number in an array
		System.out.println("Smallest number :" + a[0]);
		System.out.println();
		System.out.println("************************");
// To sort the elements of an array in descending order
		System.out.println("Print the elements of an array in descending order");
		for (int n = 0; n < a.length; n++) {
			for (int o = n + 1; o < a.length; o++) {
				if (a[n] < a[o]) {
					int temp = a[n];
					a[n] = a[o];
					a[o] = temp;
				}
			}
		}
		for (int n = 0; n < a.length; n++) {
			System.out.print(a[n] + " ");
		}
		System.out.println();
		System.out.println("************************");
	}
}
