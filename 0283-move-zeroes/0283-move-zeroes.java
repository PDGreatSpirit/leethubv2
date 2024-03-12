class Solution {
    public void moveZeroes(int[] nums) {
        int Posion = 0 ;
        for (int i = 0; i <nums.length; i++) {
            if(nums[i] != 0 ){
                int temp = nums[Posion];
                nums[Posion] = nums[i];
                nums[i]=temp;
                Posion++;
            }
        }
    }
}