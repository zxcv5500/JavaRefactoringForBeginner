package ReplaceTypeCodeWithSubclasses.step1;

public class ShapeLine extends Shape {

	protected ShapeLine(int typecode, int startx, int starty, int endx, int endy) {
		super(typecode, startx, starty, endx, endy);
	}

	@Override
	public int getTypecode() {
		// TODO Auto-generated method stub
		return Shape.TYPECODE_LINE;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public void draw() {
		drawLine();
	}
	
	private void drawLine() {
		System.out.println("drawLine : " + this.toString());
	}
	
	
}
