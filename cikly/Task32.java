package by.home.les3.cikly;

public class Task32 {

	public static void main(String[] args) {

		String str = "Hi";
		char c = str.charAt(1);

		boolean flag = true;
		int i;
		for (i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			if (i == 0) {
				if (c == '_' || c == 'A' || c == 'B' || c == 'C' || c == 'D' || c == 'E' || c == 'F' || c == 'G'
						|| c == 'H' || c == 'I' || c == 'J' || c == 'K' || c == 'L' || c == 'M' || c == 'N' || c == 'O'
						|| c == 'P' || c == 'Q' || c == 'R' || c == 'S' || c == 'T' || c == 'U' || c == 'V' || c == 'W'
						|| c == 'X' || c == 'Y' || c == 'Z' || c == 'a' || c == 'b' || c == 'c' || c == 'd' || c == 'e'
						|| c == 'f' || c == 'g' || c == 'h' || c == 'i' || c == 'j' || c == 'k' || c == 'l' || c == 'm'
						|| c == 'n' || c == 'o' || c == 'p' || c == 'q' || c == 'r' || c == 's' || c == 't' || c == 'u'
						|| c == 'v' || c == 'w' || c == 'x' || c == 'y' || c == 'z') {
					// ok
				} else {
					flag = false;
					break;
				}
			} else {
				if (c == '_' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7'
						|| c == '8' || c == '9' || c == '0' || c == 'A' || c == 'B' || c == 'C' || c == 'D' || c == 'E'
						|| c == 'F' || c == 'G' || c == 'H' || c == 'I' || c == 'J' || c == 'K' || c == 'L' || c == 'M'
						|| c == 'N' || c == 'O' || c == 'P' || c == 'Q' || c == 'R' || c == 'S' || c == 'T' || c == 'U'
						|| c == 'V' || c == 'W' || c == 'X' || c == 'Y' || c == 'Z' || c == 'a' || c == 'b' || c == 'c'
						|| c == 'd' || c == 'e' || c == 'f' || c == 'g' || c == 'h' || c == 'i' || c == 'j' || c == 'k'
						|| c == 'l' || c == 'm' || c == 'n' || c == 'o' || c == 'p' || c == 'q' || c == 'r' || c == 's'
						|| c == 't' || c == 'u' || c == 'v' || c == 'w' || c == 'x' || c == 'y' || c == 'z') {
				} else {
					flag = false;
					break;
				}
			}
		}
		if (flag) {
			System.out.println("Строка корректна");
		} else {
			System.out.println("Строка некорректна");
		}

	}
}
