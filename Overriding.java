

class ItplPass {
	public void pass() {
		System.out.println("You are allowed inside ITPL");
	}
}

class PioneerPass extends  ItplPass {
	public void pass() {
		System.out.println("You are allowed in Pioneer block");
	}
}
class VictorPass extends  ItplPass {
	public void pass() {
		System.out.println("You are allowed in Victor block");
	}
}

public class Overriding {

	public static void main(String args[]) {
		ItplPass a = new ItplPass();   
		PioneerPass b = new PioneerPass();   
		VictorPass c= new VictorPass();
		a.pass();   
		b.pass();   
		c.pass();
	}
}

