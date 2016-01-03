
import java.util.Scanner;

public class Main{

	public static void main(String ... arg){
		LightsOut game = new LightsOut();
		Scanner jin = new Scanner(System.in);
		while(true){
			int i = jin.nextInt();
			int j = jin.nextInt();
			game.light(new FF.Point(i, j));
			game.showMap();
		}
		
	}

	


}
