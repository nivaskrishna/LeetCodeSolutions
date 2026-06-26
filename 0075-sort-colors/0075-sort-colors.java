class Solution {
    public void sortColors(int[] nums) {
        int size = nums.length;
        int temp =0;
        int minIndex =-1;

        for(int i=0; i<size-1; i++){
            minIndex= i;
            for(int j=i+1; j<size; j++){
                if(nums[minIndex] > nums[j]){
                    minIndex = j;
                }
            }
            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
    
    }
}