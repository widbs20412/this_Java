package p02_If_Switch;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		// scanner
		Scanner sc = new Scanner(System.in);
		int score = Integer.parseInt(sc.next());
		char grade;

		switch (score / 10) {
		case 10:
			grade = 'A';
			break;
		case 9:
			grade = 'B';
			break;
		case 8:
			grade = 'C';
			break;
		case 7:
			grade = 'D';
			break;
		case 6:
			grade = 'E';
			break;

		default:
			grade = 'F';
			break;
		}
		System.out.println("학점은? " + grade);
		sc.close();
	}

}
