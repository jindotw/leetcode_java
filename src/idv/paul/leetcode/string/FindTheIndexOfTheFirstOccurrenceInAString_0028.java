package idv.paul.leetcode.string;
/*
https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
28. Find the Index of the First Occurrence in a String
Easy
4.4K
229
Companies
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.



Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.

Constraints:

1 <= haystack.length, needle.length <= 104
haystack and needle consist of only lowercase English characters.

Related Topics
Two Pointers
String
String Matching
 */

public class FindTheIndexOfTheFirstOccurrenceInAString_0028 {
	public static int strStr(String haystack, String needle) {
		int hLen = haystack.length();
		int nLen = needle.length();

		if (nLen > hLen)
			return -1;

		for (int i=0; i<=hLen-nLen; i++) {
			int j = 0;
			while (j<needle.length() && haystack.charAt(i+j) == needle.charAt(j))
				j++;
			if (j == nLen)
				return i;
		}

		return -1;
	}

	public static void main(String ...argv) {
		String haystack = "sadbutsad";
		String needle = "sad";
		System.out.println(strStr(haystack, needle));
	}
}
