package leetcode;

public class FewestcoinChangingBottomUpApproach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] coins= {1,2,5};
	System.out.println(coinsChange(coins,11));
	}

	private static int coinsChange(int[] coins, int total) {
		//tushar video for reference
		// TODO Auto-generated method stub
	int[] T=new int[total+1];
	for(int i=1;i<=total;i++)
	{
		T[i]=Integer.MAX_VALUE-1;
	}
	for(int j=0;j<coins.length;j++)
	{
		for(int i=1;i<=total;i++)
		{
			if(i>=coins[j])
			{
				T[i]=Math.min(T[i], 1+T[i-coins[j]]);
			}
		}
	}return T[total];
	}

}
