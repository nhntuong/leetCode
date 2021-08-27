import java.lang.reflect.Array;
import java.util.HashMap;

public class twoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] target_num = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    target_num[0] = i;
                    target_num[1] = j;
                }
            }
        }
        return target_num;
    }

    public int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num_need = target - nums[i];
            if (map.containsKey(num_need)) {
                int[] list = {map.get(num_need), i};
                return list;
            }
            map.put(nums[i], i);
        }
        return new int[2];
    }

    public int[] twoSum3(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        for (int i = left ; i <= right;) {
            if (nums[left] + nums[right] == target){
                int[] arr = {left + 1, right +1};
                return arr;
            }
            else if (nums[left] + nums[right] < target){
                left++;
            }
            else{
                right--;
            }
        }
        return new int[2];
    }
}
