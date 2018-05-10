package ReplaceConstructorWithFactoryMethod.subclass;

public class ShapeOval extends Shape {

	public ShapeOval(int startx, int starty, int endx, int endy) {
		super(startx, starty, endx, endy);
		
	}

	@Override
	public String getName() {		
		return "Oval";
	}

	@Override
	public void draw() {
		System.out.println("drawOval : " + this.toString());
	}

}
