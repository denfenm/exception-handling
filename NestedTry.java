class NestedTry{  //nak catch specifically that exception
	//to 
 public static void main(String args[]){  
  try{  //one try outisde and other try inside
    try{  
     System.out.println("going to divide");  
     int b =39/0;  
    }catch(ArithmeticException e){System.out.println(e);}  
   
    try{  
    int a[]=new int[5];  
    a[5]=4;  
    }catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}  
     
    System.out.println("other statement");  
  }catch(Exception e){System.out.println("handeled");}  
  //not printed because arrayindex.. dah catch
  System.out.println("normal flow..");  
 }  
}  