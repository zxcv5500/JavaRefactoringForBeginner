package ReplaceTypeCodeWithClass.step2;

public class Item {
	// #4 이제 안쓰는 int 분류타입 삭제 : public static final int TYPECODE_XXX = 0  
	
	private final ItemType _itemtype;
	private final String _title;
	private final int _price;

	
	/* #1 생성자의 분류코드를 새 클래스 타입으로 대체함
	public Item(int typecode, String title, int price) {
		_itemtype = ItemType.getItemType(typecode);
		_title = title;
		_price = price;
	}
	//*/
	
	public Item(ItemType itemtype, String title, int price) {
//		_itemtype = ItemType.getItemType(typecode);			// #2 int타입이던 분류코드를 새 클래스로 대체함.
		_itemtype = itemtype;
		_title = title;
		_price = price;
	}
	
//	public int getTypecode() { return _itemtype.getTypecode(); }		// #3 클래스로 대체해서 쓰지 않게된 메소드 제거함
	public String getTitle() { return _title; }
	public int getPrice() { return _price; }
	
	public String toString() {
		return "[ "
				+ _itemtype.getTypecode() + ", "
				+ getTitle() + ", "
				+ getPrice() + " ]";
	}
	
	// ....
}
