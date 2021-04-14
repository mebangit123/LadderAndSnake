public class SnakeAndLadder {
	public static void main(String[] args) {
		System.out.println("Snake And Ladder Simulator Problem");

		int player= 0 ;
		int start = 0;

		int roll_die = (int)Math.floor((Math.random() * 10) % 6) + 1;
		System.out.println(roll_die);
	}
}
