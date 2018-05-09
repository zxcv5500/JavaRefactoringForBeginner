package ReplaceTypeCodeWithSubclasses.step2;

public class ShapeOval extends Shape {

	protected ShapeOval(int typecode, int startx, int starty, int endx, int endy) {
		super(typecode, startx, starty, endx, endy);
	}

	@Override
	public int getTypecode() {
		return Shape.TYPECODE_OVAL;
	}

	@Override
	public String getName() {
		return "OVAL";
	}

	@Override
	public void draw() {
		drawOval();
	}
	
	private void drawOval() {
		System.out.println("drawOval ; " + this.toString());
		// ...
	}
	
	
	
}
