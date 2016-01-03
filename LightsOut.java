

public class LightsOut{
	private int size = 0;
	private boolean[][] map;
	public LightsOut(){
		setSize(3);
		init();
	}

	public LightsOut(int intSize){
		setSize(intSize);
		init();
	}
	//To initialie game map.
	private void init(){
		map = new boolean[size][size];
		for (int i = 0 ; i < size ; i++){
			for (int j = 0 ; j < size ; j++){
				map[i][j] = false;
			}
		}

	}
	//To get map size.
	public int getSize(){return size;}
	private void setSize(int intSize){
                if (intSize < 3) intSize = 3;
                if (intSize % 2 == 0) intSize--;
		size = intSize;
	}
	public boolean[][] getMap(){return map;}

	public void light(FF.Point point){
		FF.Point[] vector = new FF.Point[]{ new FF.Point(-1,0), new FF.Point(0,-1), new FF.Point(0,0), new FF.Point(0,1), new FF.Point(1,0)};
		for (int i = 0 ; i < vector.length ; i++){
			int row = point.i + vector[i].i;
			int col = point.j + vector[i].j;
			if (FF.isPointInArray(map, new FF.Point(row, col))){
				map[row][col] = !map[row][col];
			}
		}

	}

	public void showMap(){
		for (int i = 0 ; i < size ; i++){
			for (int j = 0 ; j < size ; j++){
				System.out.print(map[i][j]?"■":"□");
				System.out.print(j==size-1?"\n":"");
			}
		}
		System.out.println();
	}
}
