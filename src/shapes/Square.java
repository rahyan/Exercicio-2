package shapes;

class Square extends Shape {
	private int side;
	Square(String aName) {
		super(aName);
		side = 3;
	}
	
	public float calculateArea() {
		float area;
		area = (float) (side*side);
		return area;
	}
}
