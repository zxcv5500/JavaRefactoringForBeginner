package ReplaceConstructorWithFactoryMethod.ExSmell;

public class Main {

	public static void main(String[] args) {
		new Client(false).execute();
		new Client(true).execute();
	}

}
