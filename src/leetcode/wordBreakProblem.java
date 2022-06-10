package leetcode;

import java.util.LinkedList;
import java.util.List;

public class wordBreakProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words= {"leet","code"};
		List<String> li=new LinkedList<>();
		for(String str:words)
		{
			li.add(str);
		}
System.out.println(wordDict(li, "leetcode"));
	}

	private static boolean wordDict(List<String> words, String str) {
		// TODO Auto-generated method stub
boolean[] dp=new boolean[str.length()+1];
dp[0]=true;
for(int i=0;i<=str.length();i++)
{
	for(int j=0;j<i;j++)
	{
		if(dp[j] && words.contains(str.substring(j,i)))
		{
			dp[i]=true;
			break;
		}
	}
}return dp[str.length()];
	}

}
