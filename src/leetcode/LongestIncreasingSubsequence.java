package leetcode;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] nums=new int[] {10,9,2,5,3,7,101,18};
System.out.println(longestIncreasingSubsequence(nums));
	}

	private static int longestIncreasingSubsequence(int[] nums) {
		// TODO Auto-generated method stub
		int[] res=new int[nums.length];
		for(int i=0;i<res.length;i++) {
			res[i]=1;
		}
		for(int i=1;i<res.length;i++) {
		for(int j=0;j<i;j++)
		{
			if(nums[j]<nums[i])
			{
				res[i]=Math.max(res[i],res[j]+1);
			}
		}
		}
		int max=0;
		for(int i=0;i<res.length;i++)
		{
			max=Math.max(max,res[i]);
		}
		return max;
	}

}
