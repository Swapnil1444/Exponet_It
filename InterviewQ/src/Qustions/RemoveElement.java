package Qustions;

public class RemoveElement {

	public static void main(String[] args) {
		int []arr= {10,20,11,22,33,20,2221,234,666,20};
		System.out.println(removeElement(arr, 20));

	}
	
	public static int removeElement(int[] nums, int val) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }

}
