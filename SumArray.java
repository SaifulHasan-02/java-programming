import java.util.Arrays;
class SumArray{
	public static void main(String[] args){
		int[] arr = {2,7,10,4};
		int target = 12;
		System.out.println(Arrays.toString(twoSum(arr,target)));
	}
	public static int[] twoSum(int[] nums, int target) {
        int i=0;
        int j = 1;
        while(i<nums.length-1){
            for(j =1+i;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
					return new int[]{i,j};
				}
            }
		    i++;
        }
        return new int[]{i,j};
	}
}