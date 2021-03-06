package Assignment1;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {

		int arr[] = { 2, 3, 5, 7, 9 };
		int target = 5;
		int indices[] = findTwoSumTarget(arr, target);
		System.out.println("The indices are:" + indices[0] + " " + indices[1]);
	}

	private static int[] findTwoSumTarget(int[] arr, int target) {

		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			int diff = target - arr[i];
			if (map.containsKey(diff)) {
				return new int[] { map.get(diff), i };
			}
			map.put(arr[i], i);
		}
		return new int[] {};
	}
}
