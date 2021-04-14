
public class SnakeAndLadder {
	public static void main(String[] args) {
		System.out.println("Snake And Ladder Simulator Problem");

		int win = 100;
		int player= 0 ;
		int start = 0;
		int ladder = 1;
		int snake = 2;
		int position = 0;


		while(player < win)
		{
			int options = (int)Math.floor(Math.random() * 10) % 3;
			int roll_die = (int)Math.floor((Math.random() * 10) % 6) + 1;
			if(position < 0)
			{
				position = start;
			}
			else
			{
				if(options == ladder)
				{
					player += roll_die;
					position += roll_die;
				}
				else if(options == snake)
				{
					player = player - roll_die;
					position -= roll_die;
				}
				else
				{
					player += 0;
				}
			}
				//System.out.println(position);
		}
		System.out.println(player);
	}
}
