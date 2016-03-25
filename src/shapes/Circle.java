package shapes;

class Circle extends Shape {
	private int radius;
	Circle(String aName, int aRadius) {
		super(aName);
		radius = aRadius;
	}
	
	public float calculateArea() {
		float area;
		area = (float) (3.14*radius*radius);
		return area;
	}
}

