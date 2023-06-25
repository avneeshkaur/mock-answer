
import java.util.Arrays;

 public class Solution {
    public void moveZeros(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[count++] = nums[i];
            }
        }

        while (count < nums.length) {
            nums[count++] = 0;
        }
    }
    
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        Solution solution = new Solution();
        solution.moveZeros(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
