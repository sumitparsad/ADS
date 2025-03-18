public class KadanesAlgo2{
    public static void main(String[] args){
        //stepsof kadanes algo
        //initialize
        int[]nums={1,-2,3,4,-1,2,1,-5,4};
        System.out.println("Maximum subarray sum is:"+maxSubArray(nums));
    }
    public static int maxSubArray(int[]nums){
        if(nums==null||nums.length==0){
            return 0;
        }
        int currentSum=0;   
        int maxSum=Integer.MIN_VALUE;
        for(int num:nums){
            currentSum=Math.max(num,currentSum+num);
            maxSum=Math.max(maxSum,currentSum);
        }
        return maxSum;
    }
}