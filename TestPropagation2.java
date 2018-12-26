//for checked exception
import java.io.*;

public class TestPropagation2 {
	void m() throws IOException {  
	    throw new IOException("device error"); //checked exception , IOException is not under checked exception
	    //pair with keyword "throw". it creates an instance of the exception
	  }  
	  void n() throws IOException {  
	    m();  
	  }  
	  void p(){  
	   try{  
	    n();  
	   }catch(Exception e){System.out.println("exception handled");}  
	  }  
	  public static void main(String args[]){  
	   TestPropagation2 obj=new TestPropagation2();  
	   obj.p();  
	   System.out.println("normal flow...");  
	  }  
}
