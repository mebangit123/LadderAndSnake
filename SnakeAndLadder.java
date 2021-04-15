
public class SnakeAndLadder {
	public static void main(String[] args) {
		System.out.println("Snake & Ladder Simulator");

		int win=100;
		int score=0;
		int player1=0;
		int player2=0;
		int ladder=1;
		int snake=2;
		int start=0;
		int die_position=0;
		int no_of_times_roll=0;

		while(player1 < win & player2 < win)
		{
			int p1=1;
			int p2=2;
			int player=(int)Math.floor((Math.random() * 10) % 3)+1;
			int options=(int)Math.floor(Math.random() * 10) % 3;
			int roll_dice=(int)Math.floor((Math.random() * 10) % 6)+1;

			if(player == p1)
			{
				if(options == ladder)
				{
					int check = player1 + roll_dice;
					if(check >  win)
					{
						player1+=0;
					}
					else
					{
						player1+=roll_dice;
					}
				}
				else if(options == snake)
				{
					player1 = player1 - roll_dice;
				}
				else
				{
					player1+=0;
				}
			}
			else if(player == p2)
			{
				if(options == ladder)
				{
					int check = player2 + roll_dice;
					if(check >  win)
					{
						player2+=0;
					}
					else
					{
						player2+=roll_dice;
					}
				}
				else if(options == snake)
				{
					player2 = player2 - roll_dice;
				}
				else
				{
					player2+=0;
				}
			}
				no_of_times_roll++;
			}

		System.out.println("No of times dice was played: "+ no_of_times_roll);

		if(player1 == win)
		{
			System.out.println("Player1 win");
		}
		else if(player2 == win)
		{
			System.out.println("Player2 win");
		}
	}
}
