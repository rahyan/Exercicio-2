package shapes;

public class Shape {
	private String name;
	Shape(String aName) {name = aName;}
	public String getName() {return name;}
	public float calculateArea() {return 0.0f;}
	
	public static void main(String argv[]){
		Square s = new Square("Square S", 3);
		Circle c = new Circle("Circle C", 3);
		Triangle t = new Triangle("Triangle T", 3, 4, 5);
		Shape shapeArray[] = {c, s, t};
		for (int i = 0; i < shapeArray.length; i++){
			System.out.println("The area of " + shapeArray[i].getName()
					+ " is " + shapeArray[i].calculateArea() + " sq. cm.\n");
		}
	}
}
