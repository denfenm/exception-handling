import java.io.*;  
class M{  
 void method()throws IOException{  
  throw new IOException("device operation performed");  //throw kena guna if and else
 }  
}  
class TestThrows4{  
   public static void main(String args[])throws IOException{//declare exception  
     M m=new M();  
     m.method();  
  //no try and catch
    System.out.println("normal flow...");  
  }  
}  