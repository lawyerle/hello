package ss;

public class HelloWorld {

	public String getMessage() {

		return "Hello World";
	}

	public String getMessageWithName(String name) {
		if (name == null) {
			return getMessage();
		}

		return "Hello " + name;

	}

}
