class Solution {

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		// Initialize three pointers:
		// p1 is for the end of the actual elements in nums1
		// p2 is for the end of nums2
		// p is for the end of nums1 (where we will place the merged elements)
		int p1 = m - 1;
		int p2 = n - 1;
		int p = m + n - 1;

		// While there are elements to compare in both arrays
		while (p1 >= 0 && p2 >= 0) {
			if (nums1[p1] > nums2[p2]) {
				nums1[p] = nums1[p1];
				p1--;
			} else {
				nums1[p] = nums2[p2];
				p2--;
			}
			p--;
		}

		// If there are remaining elements in nums2, copy them over
		// If p2 is still >= 0; that means there are elements in nums2
		// that need to be placed in nums1.
		while (p2 >= 0) {
			nums1[p] = nums2[p2];
			p--;
			p2--;
			
		}

	} // end method merge
	


} // end class Solution