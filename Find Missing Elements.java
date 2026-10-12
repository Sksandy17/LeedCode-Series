class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int min = nums[0];
        int max = nums[0];
        for(int i=1; i<nums.length; i++){
            if(min>nums[i])
                min = nums[i];
            if(max<nums[i])
                max = nums[i];
        }
        for(int i=min; i<=max; i++){
            boolean found = false;
            for(int j=0; j<nums.length; j++){
                if(nums[j]==i){
                    found = true;
                    break;
                }
            }
            if(!found)
                ans.add(i);
        }
        return ans;
    }
}
