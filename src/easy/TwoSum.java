package easy;

import java.util.*;

public class TwoSum {
    public static void main(String[] args)
    {
        int[] nums = new int[]{3,2,4};
        System.out.println(Arrays.toString(twoSum(nums,6)));
    }
    static int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> num_lst = new ArrayList<>();
        HashSet<Integer> num_set = new HashSet<>();
        for(int i: nums)
        {
            num_lst.add(i);
            num_set.add(i);
        }
        int max = target - Collections.min(num_lst);
        for(int i = nums.length-1; i >= 0; i--)
        {
            System.out.println(nums[i]);
            if(nums[i] <= max) {
                int j = num_lst.indexOf(target-nums[i]);
                if (i != j && num_set.contains(target - nums[i])) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[2];
    }
}
