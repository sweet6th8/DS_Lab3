package lab3_algorithms;

public class MyArray {
	private int[] array;

	public MyArray(int[] array) {
		this.array = array;
	}

// To find the index of the target in the array. If the target 
// is not found in the array, then the method returns -1.
// Input: int[] array = {12, 10, 9, 45, 2, 10, 10, 45}, 45
// Output: 3
	public int iterativeLinearSearch(int target) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				return i;
			}
		}
		return -1;
	}

// To find the index of the target in the array. If the target 
// is not found in the array, then the method returns -1.
// Input: int[] array = {12, 10, 9, 45, 2, 10, 10, 45}, 15
// Output: -1
	public int recursiveLinearSearch(int target) {
		return recursiveLinearSearch2(target, array.length - 1);
	}

	public int recursiveLinearSearch2(int target, int i) {
		if (i < 0)
			return -1;
		if (array[i] == target)
			return i;
		return recursiveLinearSearch2(target, i - 1);
	}

	// To find the index of the target in the sorted array. If the
	// target is not found in the array, then the method returns -1.
	public int iterativeBinarySearch(int target) {
		int n = array.length;
		for (int i = 0; i < n; i++) {
			int left = 0;
			int right = n - 1;
			while (left < right) {
				int mid = left + (right - left) / 2;
				if (target == array[mid]) {
					return mid;
				} else if (target > array[mid]) {
					left = mid + 1;
				} else {
					right = mid - 1;
				}
			}
		}

		return -1;
	}

	// To find the index of the target in the sorted array. If the
	// target is not
	// found in the array, then the method returns -1.
	public int recursiveBinarySearch(int target) {

		return recursiveBinarySearch2(target, 0, array.length - 1);
	}

	public int recursiveBinarySearch2(int target, int left, int right) {
		int n = array.length;
		if (left > right)
			return -1;

		int mid = left + (right - left) / 2;
		if (target == array[mid]) {
			return mid;
		} else if (target > array[mid]) {
			recursiveBinarySearch2(target, mid + 1, right);
		} else {
			recursiveBinarySearch2(target, mid + 1, mid - 1);
		}
		return -1;
	}
	
	public static void main(String[] args) {
		MyArray arr = new MyArray(new int[] { 12, 10, 9, 45, 2, 10, 10, 45 });
		System.out.println(arr.iterativeLinearSearch(45));
		System.out.println(arr.recursiveLinearSearch(15));
		System.out.println(arr.iterativeBinarySearch(45));
		System.out.println(arr.iterativeBinarySearch(15));
		System.out.println(arr.recursiveBinarySearch(45));
		System.out.println(arr.recursiveBinarySearch(15));
	}
}