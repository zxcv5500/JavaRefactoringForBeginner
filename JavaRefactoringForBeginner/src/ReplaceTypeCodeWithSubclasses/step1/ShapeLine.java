package ReplaceTypeCodeWithSubclasses.step1;

public class ShapeLine extends Shape {

	protected ShapeLine(int _typecode, int _startx, int _starty, int _endx, int _endy) {
		super(_typecode, _startx, _starty, _endx, _endy);
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
