//declare the excepton: in case you declare the exception
//throws keyword at the top, because in the future if i do sql exception; i m inidicating the compiler that i might throw an exception
import java.io.*;

class Y {
	void method()throws IOException {
		System.out.println("device operation performed");
	}
}
class TestThrows3 {
	public static void main(String args[])throws IOException{ //declare exception
		Y y = new Y();
		y.method();
		
		System.out.println("normal flow...");
	}
}
