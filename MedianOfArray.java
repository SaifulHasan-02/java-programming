class MedianOfArray{
	public static void main(String[] args){
		int []nums1 = {1,3};
		int []nums2 = {2};
		double ans = findMedianSortedArrays(nums1,nums2);
		System.out.println(ans);
	}
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        int k=0;
        int n = nums1.length+nums2.length;
        int e=n-1;
        int mid=nums1.length-1;
        int []b = new int[n];
        while(i<= mid && j<= e ){
            if(nums1[i]<nums2[j]){
                b[k]=nums1[i];
                i++;
            }
            else{
                b[k]=nums2[j];
                j++;
            }
            k++;
        }
        if(i>mid){
            while(j<=e){
                b[k]=nums2[j];
                k++;
                j++;
            }
        }
        else{
            while(i<=mid){
                b[k]=nums1[i];
                k++;
                i++;
            }
        }
        if(n%2 != 0){
            return (double)(b[n/2]);
        }
        else{
            return (double)((b[n/2-1]+b[n/2])/2);
        }
    }
}