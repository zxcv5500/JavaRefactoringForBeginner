package ReplaceConstructorWithFactoryMethod.subclass;

public class ShapeRectangle extends Shape {

	protected ShapeRectangle(int startx, int starty, int endx, int endy) {
		super(startx, starty, endx, endy);
	}

	@Override
	public String getName() {
		
		return "Rectangle";
	}

	@Override
	public void draw() {
		System.out.println("drawRectangle : " + this.toString());
	}

}
