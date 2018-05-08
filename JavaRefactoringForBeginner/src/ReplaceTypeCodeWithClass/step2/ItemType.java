package ReplaceTypeCodeWithClass.step2;

public class ItemType {
	public static final ItemType BOOK = new ItemType(0);
	public static final ItemType DVD = new ItemType(1);
	public static final ItemType SOFTWARE = new ItemType(2);
	
	
	private final int _typecode;
	private ItemType(int typecode) {
		_typecode = typecode;
	}
	
	public int getTypecode() { return _typecode; }

	/* #1 사용하지 않는 코드가 된 메소드는 제거한다.
	public static ItemType getItemType(int typecode) {
		switch (typecode) {
			case 0: return BOOK;
			case 1: return DVD;
			case 2: return SOFTWARE;
			default: return null;
		}
	}
	//*/
}
