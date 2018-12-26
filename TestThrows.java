import java.io.IOException;
import java.sql.SQLException;
import java.awt.*;

public class TestThrows {
		void m()throws IOException, SQLException, AWTException{  
		    throw new java.io.IOException("device error"); //checked exception, this is called declaring
		    //pair with keyword "throw". it creates an instance of the exception
		  }  
		  void n()throws IOException, SQLException, AWTException{  
		    m();  
		  }  
		  void p(){  
		   try{  
		    n();  
		   }catch(Exception e){System.out.println("exception handled");}  
		  }  
		  public static void main(String args[]){  
		   TestThrows obj=new TestThrows();  
		   obj.p();  
		   System.out.println("normal flow...");  
		  }  
	}


