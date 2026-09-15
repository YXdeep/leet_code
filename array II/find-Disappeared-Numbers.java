/* 
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums. 

Example 1:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]

Example 2:
Input: nums = [1,1]
Output: [2] 

Constraints:
n == nums.length
1 <= n <= 105
1 <= nums[i] <= n
*/




class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        int[] count = new int[n+1];
        List<Integer> result = new ArrayList<>();
        int miss = 0;
        for (int num : nums) {
            count[num]++;
        }
        for(int i = 1; i <=n; i++) {
            if(count[i] == 0) {
                miss = i;
                result.add(miss);
            }        
        }
        return result;
    }
}
