package shapes;

class Square extends Shape {
	private int side;
	Square(String aName, int aSide) {
		super(aName);
		side = aSide;
	}
	
	public float calculateArea() {
		float area;
		area = (float) (side*side);
		return area;
	}
}
