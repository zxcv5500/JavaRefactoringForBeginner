package ReplaceTypeCodeWithClass.step1;

public class Item {
	/* #1 분류 코드를 ItemType클래스로 대체함 
	public static final int TYPECODE_BOOK = 0;
	public static final int TYPECODE_DVD = 1;
	public static final int TYPECODE_SOFTWARE = 2;
	//*/
	
	public static final int TYPECODE_BOOK = ItemType.BOOK.getTypecode();
	public static final int TYPECODE_DVD = ItemType.DVD.getTypecode();
	public static final int TYPECODE_SOFTWARE = ItemType.SOFTWARE.getTypecode();
	
//	private final int _typecode;  //#2 분류 코드를 ItemType클래스를 사용하도록 변경
	private final ItemType _itemtype;
	private final String _title;
	private final int _price;

	
	
	public Item(int typecode, String title, int price) {
//		_typecode = typecode; //#3 분류코드에서 ItemType 인스턴스로 변환
		_itemtype = ItemType.getItemType(typecode);
		_title = title;
		_price = price;
	}
	
//	public int getTypecode() { return _typecode; } // #4 ItemType을 사용하도록 수정
	public int getTypecode() { return _itemtype.getTypecode(); }
	public String getTitle() { return _title; }
	public int getPrice() { return _price; }
	
	public String toString() {
		return "[ "
				+ getTypecode() + ", "
				+ getTitle() + ", "
				+ getPrice() + " ]";
	}
	
	// ....
}
