package org.example;

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int tmp = nums[i];
            if (map.containsKey(target - tmp)) {
                res[0] = i;
                res[1] = map.get(target - tmp);
                break;
            }
            map.put(tmp, i);
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] res = solution.twoSum(nums, target);
        System.out.println(res[0] + " " + res[1]);
    }
}