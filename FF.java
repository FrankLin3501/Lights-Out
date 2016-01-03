

public class FF{

	public static class Point{
		public int i, j;
		public Point(int i, int j){
			this.i = i;this.j = j;
		}
	}

	public static void showArray(String[][] a){
		int n = a.length, m = 0;
		for (int i = 0 ; i < n ; i++){
			m = a[i].length;
			for (int j = 0 ; j < m ; j++){
				System.out.print(a[i][j]);
				System.out.print(j==m-1?"\n":"\t");
			}
		}
		System.out.println();
	}

	public static boolean isPointInArray(boolean[][] a, Point p){
		if ( p.i >= 0 && p.i < a.length && p.j >= 0 && p.j < a[p.i].length ) return true;
		return false;
	}


}
