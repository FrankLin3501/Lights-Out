
import java.util.Scanner;

public class Main{

	public static void main(String ... arg){
		LightsOut game = new LightsOut();
		Scanner jin = new Scanner(System.in);
		game.start();
		while(true){
			int i = jin.nextInt(), j = jin.nextInt();			
			game.light(new FF.Point(i, j));
			game.showMap();
			if (game.isGameOver()){
				if(askContinue()){
					game.start();
				}else{
					break;
				}
			}
		}
		System.out.println("Thanks for playing.");
	}

	private static boolean askContinue(){
		System.out.println("Do you want to continue?(y/n)");
		Scanner jin = new Scanner(System.in);
		return jin.next().trim().equals("y")?true:false;
	}


}
