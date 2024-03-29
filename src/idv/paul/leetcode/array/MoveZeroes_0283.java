package idv.paul.leetcode.array;

/*
https://leetcode.com/problems/move-zeroes/description/
283. Move Zeroes
Easy
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]


Constraints:

1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1


Follow up: Could you minimize the total number of operations done?

Related Topics
Array
Two Pointers
 */

import java.util.Arrays;

public class MoveZeroes_0283 {
	public static void moveZeroes(int[] nums) {
		int i = 0;
		for (int num : nums) {
			if (num != 0) {
				nums[i++] = num;
			}
		}
		while (i < nums.length) {
			nums[i++] = 0;
		}
	}

	public static void main(String ...argv) {
		int[] nums = new int[]{1, 0, 3, 2};
		moveZeroes(nums);
		System.out.println(Arrays.toString(nums));
	}
}
