package shapes;

class Triangle extends Shape {
	private int a, b, c;
	private float p;
	Triangle(String aName, int aA, int aB, int aC) {
		super(aName);
		a = aA;
		b = aB;
		c = aC;
		p = (a + b + c)/2;
	}
	
	public float calculateArea() {
		float area;
		area = (float) Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return area;
	}
}
