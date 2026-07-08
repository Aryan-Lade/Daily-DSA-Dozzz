//88. Merge Sorted Array
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a=m-1;
        int b=n-1;
        for (int z=m+n-1;a>=0 && b>=0;z--) {
            if (nums1[a]>nums2[b]) {
                nums1[z]=nums1[a];
                a--;
            }
            else {
                nums1[z]=nums2[b];
                b--;
            }
        }
        for (int z=b;z>=0;z--) {
            nums1[z]=nums2[b];
            b--;
        }
    }
}