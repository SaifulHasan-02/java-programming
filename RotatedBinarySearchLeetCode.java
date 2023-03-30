class RotatedBinarySearchLeetCode{
	public static void main(String[] args){
		int[] arr = {4,5,6,7,0,1,2};
		int target = 0;
		System.out.println(search(arr,target));
		
	}
	public static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if(nums[pivot]==target)
            return pivot;
        if(pivot == -1){
            return binarySearch(nums,0,nums.length-1,target);
        }
        if(nums[pivot] > target){
            return binarySearch(nums,0,pivot-1,target);
        }
        else if(nums[pivot] < target){
            return binarySearch(nums,pivot+1,nums.length-1,target);
        }
        return -1;
        
    }
    public static int binarySearch(int[] arr,int start,int end,int target){
        if(start>end)
            return -1;
        int mid = start + (end-start)/2;
        if(arr[mid] == target){
            return mid;
        }
        else if(arr[mid]>target){
            return binarySearch(arr,0,mid-1,target);
        }
        else{
            return binarySearch(arr,mid+1,end,target);
        }
    }
    public static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1] && mid<end)
                return mid;
            if(arr[mid]>arr[mid-1] && mid>start)
                return mid;
            if(arr[mid]<arr[start]){
                end = mid - 1;
            }
            if(arr[mid]>arr[start]){
                start = mid+1;
            }
        }
        return -1;
    }
}
	