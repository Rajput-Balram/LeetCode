package Array;

class Solution {
    public void moveZeroes(int[] nums) {
        int k=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0)
                nums[k++] = nums[i];
        }
        for(int j=k; j<nums.length; j++){
            nums[j] = 0;
        }
        for(int no : nums)
            System.out.print(no+" ");
    }
}

public class ZeroToTail {

	public static void main(String[] args) {
		Solution ob = new Solution();
		int[] arr = { 0, 1, 0, 3, 12 };
		ob.moveZeroes(arr);
	}

}
