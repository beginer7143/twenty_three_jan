/*
Problem:
 Return an array of unique elements present in both arrays.
Example:
 Input: nums1 = [1,2,2,1], nums2 = [2,2]
 Output: [2]

*/
package twenty_three_jan;

public class Problem_2 {
public static void main(String[] args) {
    int[] nums1 = {1, 2, 2, 1};
    int[] nums2 = {2, 2};

    for (int i = 0; i < nums1.length; i++) {
        boolean printed = false;

        for (int k = 0; k < i; k++) {
            if (nums1[i] == nums1[k]) {
                printed = true;
                break;
            }
        }

        if (printed) continue;

        for (int j = 0; j < nums2.length; j++) {
            if (nums1[i] == nums2[j]) {
                System.out.print(nums1[i] + " ");
                break;
            }
        }
    }
}

}
