package Assignment1;

public class BuySellStock {

	public static void main(String[] args) {
		//int[] prices= {3,3,5,0,0,3,1,4};
		//int[] prices= {1,2,3,4,5};
		//int[] prices= {5,4,3,2,1};
		int[] prices= {3,3};
		int n=prices.length;
		int max=maxProfit(prices,n);
		System.out.println(+max);
	}

	private static int maxProfit(int[] prices,int n) {

		int fb=Integer.MIN_VALUE;
		int sb=Integer.MIN_VALUE;
		int fs=0;
		int ss=0;
		
		if(n==0 || n<2)
		{
			return 0;
		}
		
		for(int i=0;i<n;i++)
		{
			fb=Math.max(fb, -prices[i]);
			fs=Math.max(fs, fb+prices[i]);
			sb=Math.max(sb, fs-prices[i]);
			ss=Math.max(ss, sb+prices[i]);
		}
		
		return ss;
	
	}
}
