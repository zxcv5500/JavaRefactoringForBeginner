package ReplaceTypeCodeWithSubclasses.step2;

public class ShapeLine extends Shape {

	protected ShapeLine(int startx, int starty, int endx, int endy) {
		super(startx, starty, endx, endy);
	}

	@Override
	public int getTypecode() {
		// TODO Auto-generated method stub
		return Shape.TYPECODE_LINE;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "LINE";
	}

	@Override
	public void draw() {
		drawLine();
	}
	
	private void drawLine() {
		System.out.println("drawLine : " + this.toString());
	}
	
	
}
