package Boat;

class RowBoat extends Boat {
	public void rowTheBoat() {
		System.out.print("stroke natasha");
	}

}

class Boat {

	private int length;
	public void setLength(int len) {
		length = len;
	}
	public int getLength() {
		return length;
	}
	public void move() {
		System.out.print("drif ");
	}
}

class SailBoat extends Boat {
	public void move() {
		System.out.print("hoist sail ");
	}
}

public class TestBoat {
	public static void main(String[] args) {
		Boat b1 = new Boat();
		SailBoat b2 = new SailBoat();
		RowBoat b3 = new RowBoat();

		b2.setLength(32);
		b1.move();
		b3.move();
		b2.move();
	}
}

// drift drift hoist sail