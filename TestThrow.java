
public class TestThrow {
static void validate(int age) throws ClassNotFoundException {
	if(age < 18)
		throw new ClassNotFoundException("not valid");//method to create a new exception object
	else
		System.out.print("welcome to vote\n");
}
public static void main(String args[]) throws ClassNotFoundException {
	//try {
	validate(13); 
	/*} catch (ArithmeticException e) {
		System.out.println(e.getMessage());
	}*/
	System.out.println("rest of the code...");
	
}
}

//because cnfe is checked exception so kena throw. kalau unchecked like runtime exception and errors, tak perlu "throws ....."