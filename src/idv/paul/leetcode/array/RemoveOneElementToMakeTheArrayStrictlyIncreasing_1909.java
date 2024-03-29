package idv.paul.leetcode.array;

/*
1909. Remove One Element to Make the Array Strictly Increasing
Easy
1.1K
301
Companies
Given a 0-indexed integer array nums, return true if it can be made strictly increasing after removing exactly one element, or false otherwise. If the array is already strictly increasing, return true.

The array nums is strictly increasing if nums[i - 1] < nums[i] for each index (1 <= i < nums.length).



Example 1:

Input: nums = [1,2,10,5,7]
Output: true
Explanation: By removing 10 at index 2 from nums, it becomes [1,2,5,7].
[1,2,5,7] is strictly increasing, so return true.
Example 2:

Input: nums = [2,3,1,2]
Output: false
Explanation:
[3,1,2] is the result of removing the element at index 0.
[2,1,2] is the result of removing the element at index 1.
[2,3,2] is the result of removing the element at index 2.
[2,3,1] is the result of removing the element at index 3.
No resulting array is strictly increasing, so return false.
Example 3:

Input: nums = [1,1,1]
Output: false
Explanation: The result of removing any element is [1,1].
[1,1] is not strictly increasing, so return false.


Constraints:

2 <= nums.length <= 1000
1 <= nums[i] <= 1000
 */

public class RemoveOneElementToMakeTheArrayStrictlyIncreasing_1909 {

	public static boolean canBeIncreasing2(int[] nums) {
		int count = 0;
		for (int i = 1; i < nums.length && count <= 1; i++) {
			if (nums[i] <= nums[i - 1]) {
				count++;
				if ((i >= 2 && nums[i] <= nums[i-2]) &&
					(i+1 < nums.length && nums[i+1] <= nums[i-1])) {
					return false;
				}
			}
		}
		return count <= 1;
	}

	public static boolean canBeIncreasing(int[] nums) {
		boolean flag = false;

		for (int i=1; i<nums.length; i++) {
			if (nums[i] <= nums[i-1]) {
				if (flag) {
					return false;
				}
				int failCount = 0;
				if (i+1<nums.length && nums[i+1] <= nums[i-1]) {
					failCount++;
				}
				if (i>=2 && nums[i] <= nums[i-2]) {
					failCount++;
				}
				if (failCount >= 2) {
					return false;
				}
				flag = true;
			}

		}

		return true;
	}

	public static void main(String ...argv) {
		int[] nums = new int[]{105,924,32,968};
		// int[] nums = new int[]{2,3,1,2};
		// int[] nums = new int[]{1, 2, 10, 5, 7};
		System.out.println(canBeIncreasing2(nums));
	}
}
