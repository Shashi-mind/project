package package_1;

import org.testng.annotations.Test;

public class Printer{

	public static boolean printOdd(int num) {
		int val = 1;
		if (val < num) {
			System.out.println(val);
			val += 2;
			printOdd(num);
		}
		return true;
	}

	@Test
	public void PrintOdds() {
		boolean var;
		var = printOdd(20);
		assert (var == true);
	}
}
