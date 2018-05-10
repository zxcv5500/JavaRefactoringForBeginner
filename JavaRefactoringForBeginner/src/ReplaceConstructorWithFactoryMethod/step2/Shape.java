package ReplaceConstructorWithFactoryMethod.step2;

public class Shape {
	public static final int TYPECODE_LINE = 0;
	public static final int TYPECODE_RECTANGLE = 1;
	public static final int TYPECODE_OVAL = 2;
	
	private final int _typecode;
	private final int _startx; 
	private final int _starty;
	private final int _endx;
	private final int _endy;
	
	public static Shape create(int typecode, int startx, int starty, int endx, int endy) {
		return new Shape(typecode, startx, starty, endx, endy);
	}
	
	private Shape(int typecode, int startx, int starty, int endx, int endy) {			// 생성자 접근성을 private로 만들어 다른 클래스들에서 이 물건을 생성할 때는 create메소드 사용을 강제한다.
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
		default:
			;
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
