class Solution {
    public void moveZeroes(int[] nums) {
        int a = 0;

        for ( int b = 0; b < nums.length; b++){
            if ( nums[b] != 0){
                nums[a] = nums[b];
                a++;
            }
        }

        while ( a < nums.length) {
            nums[a] = 0;
            a++;
        }

    }
}