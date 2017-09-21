package crazyJava;

public class BreakTest {
	public static void main(String[] args) {
		outer:
			for (int i = 0;i<10 ;i++) {
				for (int j = 0;j<3;j++) {
					if (j == 1) {
						break outer;
					}
				}
			}
	}
}
