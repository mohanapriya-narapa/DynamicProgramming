package leetcode;

public class climbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(climbingStairs(6));
	}

	private static int climbingStairs(int n) {
		// TODO Auto-generated method stub
		int[] dp=new int[n+1];
		dp[0]=1;dp[1]=1;
		for(int i=2;i<=n;i++)
		{
			dp[i]=dp[i-1]+dp[i-2];
		}
		return dp[n];
	}
}
