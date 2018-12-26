class MultipleCatchBlock1{  
  public static void main(String args[]){  
   try{  
    int a[]=new int[5];  
    a[5]=30/0;  
   }  
   catch(Exception e){System.out.println("common task completed");} //parent exception mesti dekat bawa!
   //the parent dah ada sini jadi dia dah catch all the errors
   catch(ArithmeticException e){System.out.println("task1 is completed");} //under indexoutofboundsexception 
   catch(ArrayIndexOutOfBoundsException e){System.out.println("task 2 completed");}  
   System.out.println("rest of the code...");  
 }  
}  