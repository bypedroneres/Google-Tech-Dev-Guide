package exercises;

public class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        
        for (int num : nums) {
            result ^= num;
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] nums1 = {2, 2, 1};
        int single1 = solution.singleNumber(nums1);
        System.out.println("Example 1: " + single1); // Output: 1
        
        int[] nums2 = {4, 1, 2, 1, 2};
        int single2 = solution.singleNumber(nums2);
        System.out.println("Example 2: " + single2); // Output: 4
        
        int[] nums3 = {1};
        int single3 = solution.singleNumber(nums3);
        System.out.println("Example 3: " + single3); // Output: 1
    }
}

