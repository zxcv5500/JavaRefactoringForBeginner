package ReplaceConstructorWithFactoryMethod.step1;

public class Shape {
	public static final int TYPECODE_LINE = 0;
	public static final int TYPECODE_RECTANGLE = 1;
	public static final int TYPECODE_OVAL = 2;
	
	private final int _typecode;
	private final int _startx; 
	private final int _starty;
	private final int _endx;
	private final int _endy;
	
	// #1 생성자를 이용해서 객체를 만드는 팩토리 메서드를 만든다
	public static Shape create(int typecode, int startx, int starty, int endx, int endy) {
		return new Shape(typecode, startx, starty, endx, endy);
	}
	
	public Shape(int typecode, int startx, int starty, int endx, int endy) {
		_typecode = typecode;
		_startx = startx;
		_starty = starty;
		_endx = endx;
		_endy = endy;
	}
	
	public int getTypecode() {
		return _typecode;
	}
	
	public String getName() {
		switch (_typecode) {
		case TYPECODE_LINE:
			return "LINE";
		case TYPECODE_RECTANGLE:
			return "RECTANGLE";
		case TYPECODE_OVAL:
			return "OVAL";
		default:
			return null;
		}
	}
	
	@Override
	public String toString() {
		return "[ "
				+ getName() + ", "
				+ "(" + _startx + ", " + _starty + ")-"
				+ "(" + _endx + ", " + _endy + ") ]";
	}
	
	public void draw() {
		switch(_typecode) {
		case TYPECODE_LINE:
			drawLine();
			break;
		case TYPECODE_RECTANGLE:
			drawRectangle();
			break;
		case TYPECODE_OVAL:
			drawOval();
			break;
		}
	}
	
	private void drawLine() {
		System.out.println("drawLine : " + this.toString());
		// ...
	}
	
	private void drawRectangle() {
		System.out.println("drawRectangle : " + this.toString());
		// ...
	}
	
	private void drawOval() {
		System.out.println("drawOval : " + this.toString());
		// ...
	}
}
