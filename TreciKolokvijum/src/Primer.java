

public class Primer {
	int a = 0;
	String str = "";
	public int oddOrPos(int[] x) {
		int count = 0;
		for (int i = 0; i < x.length + 100; i++) {
			if (x[i] % 2 == 1 && x[i] > 0) {
				count++;
			}
		}
		return count;
	}
	// test: x = [-3, -2, 0, 1, 4]; Expected = 3

//Feature 1

}

