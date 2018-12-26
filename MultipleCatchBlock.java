//exam 2014
	public class MultipleCatchBlock{  
		  public static void main(String args[]){  
		   try{  
		    int a[]=new int[5];  
		    a[5]=30/0;  //arrayindexoutofbounds for a[5], expression goes from right to left
		   }  
		   catch(ArithmeticException e){System.out.println("task1 is completed");}  //this exception is given first so ni keluar dulu
		   catch(ArrayIndexOutOfBoundsException e){System.out.println("task 2 completed");}  
		   catch(Exception e){System.out.println("common task completed");}  
		  
		   System.out.println("rest of the code...");  //i wnat thee rest of the code to work even if there are errors there
		 }  
		}  

//once it encounters the first catch block it wil be handled and go to the rest of the code