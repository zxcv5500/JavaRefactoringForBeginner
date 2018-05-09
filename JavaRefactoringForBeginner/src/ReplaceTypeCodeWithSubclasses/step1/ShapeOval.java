package ReplaceTypeCodeWithSubclasses.step1;

public class ShapeOval extends Shape {

	protected ShapeOval(int _typecode, int _startx, int _starty, int _endx, int _endy) {
		super(_typecode, _startx, _starty, _endx, _endy);
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
