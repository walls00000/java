package sorting;

import java.util.Random;

public class SortMain {

	public static void main(String[] args) {

		final int mod = 4;
		final int limit = 20;
		int[] array = new int[limit];
		Random random = new Random(-2L);
		for (int i = 0; i< array.length; i++) {
			array[i] = random.nextInt(20);
		}
		printArray(array);
		Sorter s = new Sorter();
		s.moduloSort(array, mod);
		printArray(array);

	}
	
	public static void printArray(final int[] a) {
		for (int i=0; i<a.length; i++) {
			System.out.printf("%d, ", a[i]);
		}
		System.out.println();
	}

}
