
public class SnakeAndLadder {
	public static void main(String[] args) {
		System.out.println("Snake And Ladder Simulator Problem");

		int win = 100;
		int player= 0 ;
		int start = 0;
		int ladder = 1;
		int snake = 2;
		int no_times_roll = 0;


		while(player < win)
		{
			int options = (int)Math.floor(Math.random() * 10) % 3;
			int roll_die = (int)Math.floor((Math.random() * 10) % 6) + 1;
				if(options == ladder)
				{
					int check = player + roll_die;
					if(check > win)
						player +=0;
					else
						player += roll_die;
				}

				else if(options == snake)
				{
					player = player - roll_die;
				}

				else
				{
					player += 0;
				}
			System.out.println("position =" +player);
			no_times_roll++;
		}
		System.out.println("You have the game");
		System.out.println("Number of Times Die is roll :"+no_times_roll);

	}
}
