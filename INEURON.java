public class Main {
	public static void main(String[] args) {
		int n = 66;
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j <= n; j++) {
				if ((j <= 6 && j >= 0) && (i == 0 || i == 6 || j == 3)) {
					System.out.print("*");
				} else if ((j >= 9 && j <= 15) && (j == 9 || j == 15 || j - i == 9))	{
					System.out.print("*");
				} else if ((j >= 18 && j <= 24) && (i == 0 || i == 3 || i == 6 || j == 18)) {
					System.out.print("*");
				} else if ((j >= 27 && j <= 33) && (i == 6 || j == 27 || j == 33)) {
					System.out.print("*");
				} else if ((j >= 36 && j <= 42) && (i == 0 || i == 3 || j == 36 || j - i == 34 || (i <= 3 && j == 42))) {
					System.out.print("*");
				} else if ((j >= 45 && j <= 50) && (i == 0 || i == 6 || j == 45 || j == 50)) {
					System.out.print("*");
				} else if ((j >= 54 && j <= 60) && (j == 54 || j == 60 || j - i == 54)) {
					System.out.print("*");
				} else System.out.print(" ");
			}
			System.out.println();
		}
	}
}