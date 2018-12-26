//if you are calling a method that declares an exception you must either catch or declare the exception
import java.io.*;
class G{
	void method()throws IOException {
		throw new IOException("device error");
	}
}
public class TestThrows2 {
	public static void main(String args[]) {
		try {
			G g = new G();
			g.method();
		}catch(Exception e )
		{
			System.out.println("exception handled"); }
			System.out.println("normal flow...");
		}
	}

