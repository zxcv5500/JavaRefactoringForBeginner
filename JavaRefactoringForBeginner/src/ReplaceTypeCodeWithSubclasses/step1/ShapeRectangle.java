package ReplaceTypeCodeWithSubclasses.step1;

public class ShapeRectangle extends Shape {

	protected ShapeRectangle(int _typecode, int _startx, int _starty, int _endx, int _endy) {
		super(_typecode, _startx, _starty, _endx, _endy);
	}

	@Override
	public int getTypecode() {
		return Shape.TYPECODE_RECTANGLE;
	}

	@Override
	public String getName() {
		
		return "RECTANGLE";
	}

	@Override
	public void draw() {
		drawRectangle();		
	}
	
	private void drawRectangle() {
		System.out.println("drawRectangle : " + this.toString());		// this.toString()의 this는 지금 코드의 위치한 클래스로 생산한 물건을 의미(new ShapeRectangle()) 
		// ...
	}
	
}
