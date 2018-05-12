package ReplaceConstructorWithFactoryMethod.ExSmell;

public class GraphPrinter extends Printer {

	@Override
	public void println(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("*");
		}
		
		System.out.printf(" (%d) ", n);
		System.out.println();
	}

}
