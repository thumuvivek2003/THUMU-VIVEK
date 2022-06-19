public class Main {
	public static void main(String[] args) {
		int n = 65;
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < n; j++) {
				if ((j < 7) && (i == 0 || j == 3)) {
					System.out.print("*");
				} else if ((j >= 9 && j <= 14) && (i == 0 || i == 3 || i == 6 || j == 9)) {
					System.out.print("*");
				} else if ((j >= 17 && j <= 23) && (i == 6 || j == 17)) {
					System.out.print("*");
				} else if ((j >= 26 && j <= 32) && (j == 26 || j == 32 || i == 6)) {
					System.out.print("*");
				} else if ((j >= 35 && j <= 41) && (i == 0 || i == 6 || i == 3) || (i <= 3 && j == 35) || (i >= 3 && j == 41)) {
					System.out.print("*");
				} else if ((j >= 44 && j <= 50) && (j == 44 || (j - (42 + i) == 0) || 48 - j == i)) {
					System.out.print("*");
				} else if ((j <= 57 && j >= 51) && (i == 0 || i == 6 || j == 51 || j == 57)) {
					System.out.print("*");
				} else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}