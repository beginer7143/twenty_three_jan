/*
Problem:
 Given an integer array nums, move all 0s to the end while maintaining the relative order of non-zero elements.
Example:
 Input: [0,1,0,3,12]
 Output: [1,3,12,0,0]

*/
package twenty_three_jan;

public class Problem_1 {
	public static void moveZeroes(int[] nums) {
		int index = 0;
		
		for(int i= 0; i< nums.length; i++) {
			if (nums[i] != 0) {
				
				nums[index++]= nums[i];
				
			}
		}
		
		while (index < nums.length) {
			nums[index++]= 0;
			
		}
	}
	
	public static void main ( String[] args) {
		int[] nums = {0,1,0,3,12};
		moveZeroes(nums);
		
		for(int n : nums) {
			System.out.print(n+" ");
		}
	}

}


/*
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        int[] result = new int[nums.length];

        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                result[index++] = nums[i];
            }
        }

        // remaining positions already 0 by default

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
 */
