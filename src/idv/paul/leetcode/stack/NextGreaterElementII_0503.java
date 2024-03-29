package idv.paul.leetcode.stack;

/*
503. Next Greater Element II
Medium

Given a circular integer array nums (i.e., the next element of nums[nums.length - 1] is nums[0]), return the next greater number for every element in nums.

The next greater number of a number x is the first greater number to its traversing-order next in the array, which means you could search circularly to find its next greater number. If it doesn't exist, return -1 for this number.

Example 1:

Input: nums = [1,2,1]
Output: [2,-1,2]
Explanation: The first 1's next greater number is 2;
The number 2 can't find next greater number.
The second 1's next greater number needs to search circularly, which is also 2.
Example 2:

Input: nums = [1,2,3,4,3]
Output: [2,3,4,-1,4]

Constraints:

1 <= nums.length <= 104
-109 <= nums[i] <= 109
*/

import java.util.*;

public class NextGreaterElementII_0503 {
	public int[] nextGreaterElements(int[] nums) {
		int n = nums.length;
		int[] result = new int[n];
		Arrays.fill(result, -1);
		Deque<Integer> stack = new ArrayDeque<>();

		for (int i = 0; i < n * 2; i++) {
			int num = nums[i % n];
			while (!stack.isEmpty() && nums[stack.peek()] < num) {
				result[stack.pop()] = num;
			}
			if (i < n) {
				stack.push(i);
			}
		}

		return result;
	}

	public static void main(String ...argv) {
		int[] nums = new int[]{1,2,1};
		int[] ans = new NextGreaterElementII_0503().nextGreaterElements(nums);
		System.out.println(Arrays.toString(ans));
	}
}
