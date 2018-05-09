package ReplaceTypeCodeWithSubclasses.factory;

public abstract class Shape {						
	public static final int TYPECODE_LINE = 0;
	public static final int TYPECODE_RECTANGLE = 1;
	public static final int TYPECODE_OVAL = 2;
	
	private final int _startx;
	private final int _starty;
	private final int _endx;
	private final int _endy;
	
	//* 분류 코드를 팩토리 객체를 받도록 수정함.
	public static Shape createShape(ShapeFactory factory, int startx, int starty, int endx, int endy) {
		return factory.create(startx, starty, endx, endy);
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
