package ReplaceTypeCodeWithSubclasses.manyfactory;

public abstract class Shape {						
	public static final int TYPECODE_LINE = 0;
	public static final int TYPECODE_RECTANGLE = 1;
	public static final int TYPECODE_OVAL = 2;
	
	private final int _startx;
	private final int _starty;
	private final int _endx;
	private final int _endy;
	

	
	/* 팩토리 메서드를 한군데서 처리하지 않고 하나씩 따로 제공해 주고 사용하는 쪽에서 알아서 호출해서 쓰도록 바꾼다.
	public static Shape createShape(int typecode, int startx, int starty, int endx, int endy) {
		switch (typecode) {
		case TYPECODE_LINE:
			return new ShapeLine(startx, starty, endx, endy);
		case TYPECODE_RECTANGLE:
			return new ShapeRectangle(startx, starty, endx, endy);
		case TYPECODE_OVAL:
			return new ShapeOval(startx, starty, endx, endy);
		default:
			throw new IllegalArgumentException("typecode = " + typecode);
		}
	}
	//*/
	
	
	public static Shape createShapeLine(int startx, int starty, int endx, int endy) {
		return new ShapeLine(startx, starty, endx, endy);
	}
	
	public static Shape createShapeRectangle(int startx, int starty, int endx, int endy) {
		return new ShapeRectangle(startx, starty, endx, endy);
	}
	
	public static Shape createShapeOval(int startx, int starty, int endx, int endy) {
		return new ShapeOval(startx, starty, endx, endy);
	}
	
	
	//*/
	protected Shape(int startx, int starty, int endx, int endy) {
		super();
		this._startx = startx;
		this._starty = starty;
		this._endx = endx;
		this._endy = endy;
	}
	
	public abstract int getTypecode();		
	
	public abstract String getName();		

	@Override
	public String toString() {
		return "[ " 
				+ getName() + ", "
				+ "(" + _startx + ", " + _starty + ", "
				+ "(" + _endx + ", " + _endy + ") ]";
	}
	
	public abstract void draw();
	
}
