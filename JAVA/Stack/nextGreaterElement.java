/*

Given an integer array, find the next greater element for every array element. The next greater element of a number x is the first greater number to the right of x in the array.

In other words, for each element A[i] in the array A, find an element A[j] such that j > i and A[j] > A[i] and the value of j should be as minimum as possible. If the next greater element doesn't exist in the array for any element, consider it -1.

Input:  [2, 7, 3, 5, 4, 6, 8]
Output: [7, 8, 5, 6, 6, 8, -1]

Input:  [5, 4, 3, 2, 1]
Output: [-1, -1, -1, -1, -1]

Note that the next greater element for the last array element is always -1.

*/

class Solution
{
	public static int[] findNextGreaterElements(int[] nums) {
		int i = 0, j = 0;
		Stack<Integer> st = new Stack<>();
		int[] ans = new int[nums.length];
		Arrays.fill(ans, -1);
		
		for (i = 0; i < nums.length; i++) {
			while (!st.isEmpty() && nums[st.peek()] < nums[i]) {
				ans[st.pop()] = nums[i]; 
			}
			
			st.push(i);
		}
		
		return ans;

	}
}
