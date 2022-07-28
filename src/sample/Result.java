package sample;

public class Result {
	public String mathFunction(int x, int y, int z) {

		if (z == x + y) {
			return "+";
		}
		if (z == (x + y) && z == (x * y)) {
			return "+ and *";
		}
		if (z == x * y || z == -(x * y)) {
			return "*";
		}
		if (z == x - y) {
			return "-";
		}
		if (z == x / y) {
			return "/";
		} else {
			return "none";

		}
	}
}
