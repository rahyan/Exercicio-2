package shapes;

class Triangle extends Shape {
	private int a, b, c;
	private float p;
	Triangle(String aName) {
		super(aName);
		a = 3;
		b = 4;
		c = 5;
		p = (a + b + c)/2;
	}
	
	public float calculateArea() {
		float area;
		area = (float) Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return area;
	}
}
