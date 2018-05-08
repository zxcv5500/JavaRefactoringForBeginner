package ReplaceTypeCodeWithClass.AnswerBadSmellEnum;

enum LunchType {
	A, B, C;
}

enum DrinkType {
	COFFEE, JUICE, TEA;
}
public class LunchSet {
		
	private final LunchType _lunchType;
	private final DrinkType _drinkType;
	
	public LunchSet(LunchType lunchType, DrinkType drinkType) {
		_lunchType = lunchType;
		_drinkType = drinkType;
	}
	
	public String toString() {
		
		return "[ LunchSet: " + _lunchType + ", " + _drinkType + " ]"; 
	}
	
	// ...
	
}
