class Solution {
    public int[] sortedSquares(int[] nums) {
        int n= nums.length;
        int[] result = new int[n];
        int left=0;
        int right=n-1;
        int pos=n-1;
        while(left <= right){
            int lefts=nums[left]*nums[left];
            int rights=nums[right]*nums[right];
            if(lefts>rights){
                result[pos]=lefts;
                left++;
            }else{
                result[pos]=rights;
                right--;
            }
            pos--;
        }
        return result;
    }
}