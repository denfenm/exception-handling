class TestFinally{  
  public static void main(String args[]){  
  try{  
   int data=25/5;  
   System.out.println(data);  
  }  
  catch(NullPointerException e){System.out.println(e);}  //skip and go to finally
  finally{System.out.println("finally block is always executed");}  
  System.out.println("rest of the code...");  
  }  
  
}  

//clean up code
//finally put for exception handling to do final processing (clean up code) - exception handling, must have a try block
//final are for methods or variables constants
//finalise auto clean up memory allocation