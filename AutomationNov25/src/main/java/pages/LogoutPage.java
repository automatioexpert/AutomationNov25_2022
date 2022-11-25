package pages;

public class LogoutPage {

	public LogoutPage() {
		System.out.println("Default constructor is called");
	}

	public static void main(String[] args) {
		LogoutPage l = new LogoutPage();
		System.out.println(l.hashCode());

	}
}
