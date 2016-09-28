package sorting;

public class Sorter {

	
	/**
	 * Sort elements in an array by their modulo
	 * @param a An array of integer to be sorted.
	 * @param modulo The modulo used for sorting.
	 */
	public void moduloSort(final int[] a, final int modulo) {
		int index = 0;
		for (int result = 0; result < modulo; result++) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] % modulo == result) {
					//copy the element into the element at index;
					int tmp = a[index];
					a[index] = a[i];
					a[i] = tmp;
					index++;
				}
			}
		}
	}
}
