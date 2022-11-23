package DP_OnGrids;

public class UNIQUE_PATHS {

	public static void main(String[] args) {

		int n = 5;
		int m = 5;
		
		System.out.println(helper(n-1,m-1,m,n));
		
	}
	
	public static int helper(int i, int j, int m, int n) {
		
		if(i == 0) {
			return 1;
		}
		
		if(j < 0 || i < 0) {
			return 0;
		}
		
		int up = helper(i-1, j, m, n);
		
		int left = helper(i, j-1, m, n);

		return up + left;

	}

}
