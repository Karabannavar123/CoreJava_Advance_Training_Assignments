import java.util.*;

 public class CoinChangeProblem
{
	static int coin[] = {1,2,5,10,20,50,100,500,2000};
	static int n = coin.length;

	static void findMin(int V)
	{
		Vector<Integer> ans = new Vector<>();
		for (int i=n-1; i>=0; i--)
		{
			while (V>= coin[i])
			{
				V -= coin[i];
				ans.add(coin[i]);
			}
		}
		for (int i = 0; i < ans.size(); i++)
		{
			System.out.print(
				" " + ans.elementAt(i));
		}
	}
	public static void main(String[] args)
	{
		int n = 70;
		System.out.print(
			"Following is minimal number "
			+"of change for " + n + ": ");
		findMin(n);
	}
}