package ReplaceTypeCodeWithSubclasses.step1;

public class ShapeRectangle extends Shape {

	protected ShapeRectangle(int typecode, int startx, int starty, int endx, int endy) {
		super(typecode, startx, starty, endx, endy);
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
