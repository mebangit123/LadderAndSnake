public class SnakeAndLadder {
	public static void main(String[] args) {
		System.out.println("Snake And Ladder Simulator Problem");

		int player= 0 ;
		int start = 0;
		int ladder = 1;
		int snake = 2;


		int options = (int)Math.floor(Math.random() * 10) % 3;
		int roll_die = (int)Math.floor((Math.random() * 10) % 6) + 1;

		if(options == ladder)
		{
			player += roll_die;
		}
		else if(options == snake)
		{
			player -= roll_die;
		}
		else
		{
			player = 0;
		}
		System.out.println(player);
	}
}
