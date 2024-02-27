package controller;

public class MultiplyController {
	
	public MultiplyController() {
		super();
	}
	
	public int multiply(int a, int b) {
		if(a == 0) {
			return 0;
		} else if(a < 0) {
			return -b + multiply(a + 1, b);
		} else {
			return b + multiply(a - 1, b);
		}
	}
}
