package leetcode;

public class longestCommonSunsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(longestCommonSubsequence("abcde", "ace"));
	}

	private static int longestCommonSubsequence(String str1, String str2) {
		// TODO Auto-generated method stub
		int[][] temp=new int[str1.length()+1][str2.length()+1];
		int max=0;
		for(int i=1;i<temp.length;i++)
		{
			for(int j=1;j<temp[0].length;j++)
			{
				if(str1.charAt(i-1)==str2.charAt(j-1))
				{
					temp[i][j]=temp[i-1][j-1]+1;
				}
				else
				{
					temp[i][j]=Math.max(temp[i-1][j],temp[i][j-1]);
				}
				max=Math.max(temp[i][j],max);
			}
		}

return max;
	}

}
