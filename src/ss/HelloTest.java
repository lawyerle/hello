package ss;

import junit.framework.TestCase;

public class HelloTest extends TestCase {
	public void testGetMessage() throws Exception {
		HelloWorld hello = new HelloWorld();
		assertEquals("Hello World", hello.getMessage());
	}
	
	public void testGetMessageWithName() throws Exception {
		HelloWorld hello = new HelloWorld();
		assertEquals("Hello Steve", hello.getMessageWithName("Steve"));
	}
	
	public void testGetMessageWithOther() throws Exception {
		HelloWorld hello = new HelloWorld();
		assertEquals("Hello Jobs", hello.getMessageWithName("Jobs"));
	}
	
	public void testGetMessageWithNull() throws Exception {
		HelloWorld hello = new HelloWorld();
		assertEquals("Hello World", hello.getMessageWithName(null));
	}
}
