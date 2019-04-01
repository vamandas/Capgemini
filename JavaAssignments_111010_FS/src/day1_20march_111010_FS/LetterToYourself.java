package day1_20march_111010_FS;

public class LetterToYourself {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v = 11, h = 80;
		String name = "Vaman Das";
		String addressLine1 = "6500 E Park St";
		String addressLine2 = "Plano, TX 76543";
		for (int i = 0; i < v; i++) {
			if (i == 0 || i == v - 1) {
				for (int j = 0; j < h; j++) {
					if (j == 0 || j == h - 1) {
						System.out.print("+");
					} else {
						System.out.print("-");
					}
				}
				System.out.println();
			}
			if (i >= 1 && i <= 3) {
				for (int j = 0; j < h; j++) {
					if (j == 0 || j == h - 1)
						System.out.print("|");
					else if (j > h - 8 && j <= h - 4)
						System.out.print("#");
					else
						System.out.print(" ");
				}
				System.out.println();
			}
			if (i == 4 || i == 5 || i == 9) {
				for (int j = 0; j < h; j++) {
					if (j == 0 || j == 79)
						System.out.print("|");
					else
						System.out.print(" ");
				}
				System.out.println();
			}
			if (i >= 6 && i < 7) {
				for (int j = 0; j < 50; j++) {
					if (j == 0)
						System.out.print("|");
					else
						System.out.print(" ");

				}
				System.out.print(name);
				for (int j = 50 + name.length(); j < 80; j++) {
					if (j == h - 1)
						System.out.print("|");
					else
						System.out.print(" ");

				}
				System.out.println();
			}
			if (i >= 7 && i < 8) {
				for (int j = 0; j < 50; j++) {
					if (j == 0)
						System.out.print("|");
					else
						System.out.print(" ");

				}
				System.out.print(addressLine1);
				for (int j = 50 + addressLine1.length(); j < 80; j++) {
					if (j == h - 1)
						System.out.print("|");
					else
						System.out.print(" ");

				}
				System.out.println();
			}
			if (i >= 8 && i < 9) {
				for (int j = 0; j < 50; j++) {
					if (j == 0)
						System.out.print("|");
					else
						System.out.print(" ");

				}
				System.out.print(addressLine2);
				for (int j = 50 + addressLine2.length(); j < 80; j++) {
					if (j == h - 1)
						System.out.print("|");
					else
						System.out.print(" ");

				}
				System.out.println();
			}
		}
	}
}
