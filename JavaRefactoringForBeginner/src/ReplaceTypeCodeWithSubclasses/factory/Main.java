package ReplaceTypeCodeWithSubclasses.factory;

public class Main {
	public static void main(String args[]) {
		//* #1 new 키워드로 물건을 생성하던 걸 팩토리 메소드로 치환한다.
		// Shape line = new ShapeLine(a, b, c, d, e) 대신 아래처럼 사용안하려고 바꾼 것 
		Shape line = Shape.createShape(ShapeFactory.LineFactory.getInstance(), 0, 0, 100, 200);
		Shape rectangle =Shape.createShape(ShapeFactory.RectangleFactory.getInstance(), 10, 20, 30, 40);
		Shape oval = Shape.createShape(ShapeFactory.OvalFactory.getInstance(), 100, 200, 300, 400);
		//*/
		Shape[] shape = {
				line, rectangle, oval
		};
		
		for (Shape s : shape) {
			s.draw();
		}
	}
}
