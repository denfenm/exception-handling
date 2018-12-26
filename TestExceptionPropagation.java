class TestExceptionPropagation{  
  void m(){  
    int data=50/0;  
  }  
  void n(){  
    m();  
  }  
  void p(){  //p calls n, n calls m, m has error. the error handled at p.this is only applicable for unchecked errors 
	  //program checks in m, it has not exception handling, go to n exception handling, go to p ada exception handling
	  //runtimeexception and subclasses, error and subclassses are unchecked exception
   try{  
    n();  
   }catch(Exception e){System.out.println("exception handled");}  
  }  
  public static void main(String args[]){  
   TestExceptionPropagation obj=new TestExceptionPropagation();  
   obj.p();  
   System.out.println("normal flow...");  
  }  
}  