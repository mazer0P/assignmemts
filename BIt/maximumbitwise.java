public class MaximumBitwiseAnd {
    public static int findMaximumBitwiseAnd(int[] nums) {
        int maxAnd = 0;
        
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int bitwiseAnd = nums[i] & nums[j];
                maxAnd = Math.max(maxAnd, bitwiseAnd);
            }
        }
        
        return maxAnd;
    }
    
    public static void main(String[] args) {
        int[] nums = {3, 5, 8, 10, 12};
        int result = findMaximumBitwiseAnd(nums);
        System.out.println(result); 
    }
}
