package ReplaceTypeCodeWithSubclasses.manyfactory;

public abstract class Shape {						// #2 기존 메서드 중 일부를 추상메서드로 만드니까 클래스도 추상 클래스로 변경해서 선언한다.
	public static final int TYPECODE_LINE = 0;
	public static final int TYPECODE_RECTANGLE = 1;
	public static final int TYPECODE_OVAL = 2;
	
//	private final int _typecode;		// #1 불필요한 분류 코드 삭제
	private final int _startx;
	private final int _starty;
	private final int _endx;
	private final int _endy;
	
	
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
	protected Shape(int startx, int starty, int endx, int endy) {				// #1 불필요한 분류 코드 삭제
		super();
//		this._typecode = typecode;		// #1 불필요한 분류 코드 삭제
		this._startx = startx;
		this._starty = starty;
		this._endx = endx;
		this._endy = endy;
	}
	
	public abstract int getTypecode();		// #3 기존 클래스의 분류코드 게터 메서드를 추상 메서드로 만듦
	
	public abstract String getName();		// #3 기존 클래스의 분류코드 게터 메서드를 추상 메서드로 만듦

	@Override
	public String toString() {
		return "[ " 
				+ getName() + ", "
				+ "(" + _startx + ", " + _starty + ", "
				+ "(" + _endx + ", " + _endy + ") ]";
	}
	
	public abstract void draw();			// #3 기존 클래스의 분류코드 게터 메서드를 추상 메서드로 만듦
	
}
