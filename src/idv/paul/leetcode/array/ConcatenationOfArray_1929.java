package idv.paul.leetcode.array;

/*
1929. Concatenation of Array
Easy
2.7K
315

Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

Specifically, ans is the concatenation of two nums arrays.

Return the array ans.



Example 1:

Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]
Example 2:

Input: nums = [1,3,2,1]
Output: [1,3,2,1,1,3,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
- ans = [1,3,2,1,1,3,2,1]


Constraints:

n == nums.length
1 <= n <= 1000
1 <= nums[i] <= 1000
 */

import java.util.Arrays;

public class ConcatenationOfArray_1929 {
	public static int[] getConcatenation(int[] nums) {
		int[] result = new int[nums.length*2];

		for (int i=0; i<result.length; i++) {
			result[i] = nums[i%nums.length];
		}

		return result;
	}

	public static void main(String ...argv) {
		int[] nums = new int[]{1, 2, 1};
		int[] result = getConcatenation(nums);
		System.out.println(Arrays.toString(result));
	}
}
