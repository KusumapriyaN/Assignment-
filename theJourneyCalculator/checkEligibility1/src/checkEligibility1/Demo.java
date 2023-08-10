package checkEligibility1;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your score");
		int score = scan.nextInt();
		Grade g=new Grade();
		g.giveGrade(score);
		

	}
}
