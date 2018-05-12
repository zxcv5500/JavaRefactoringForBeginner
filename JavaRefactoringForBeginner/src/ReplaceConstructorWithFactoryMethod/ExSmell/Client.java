package ReplaceConstructorWithFactoryMethod.ExSmell;

public class Client {
	private final Printer _printer;				// Client는 Printer에 의존
	
	public Client(boolean graphical) {
		if (graphical) {
			_printer = new GraphPrinter();		// Client는 GraphPrinter에 의존
		} else {
			_printer = new DigitPrinter();		// Client는 DigitPrinter에 의존
		}
	}
	
	public void execute() {
		int[] table = { 3, 1, 4, 1, 5, 9 };
		for (int n : table) {
			_printer.println(n);
		}
	}
}
