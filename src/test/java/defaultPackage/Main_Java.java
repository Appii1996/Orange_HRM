package defaultPackage;

public class Main_Java 
{
      static void demo(String a)
      {
    	  System.out.println("hi");
    	if (a.equals("end"))
    	{
    		throw new ArrayIndexOutOfBoundsException();
    		
    	}
    	  
    	  
    	  
      }
	static String o;
	public static void main(String[] args)
	{
		
	//demo("ended");
		int a=10;
		int b=0;
		int c=0;
		//try--> catch --> finally 
		 try
		 {
			 System.out.println("try started");
			 System.out.println(o.charAt(1));    //null
			 int o= a/b;    //risky code
			 System.out.println("try ended");	
		 }
		 catch(Exception o)   // if we dont which exception is getting
		// catch(ArithmeticException o) // if we knew exception then enter there
		 {
			 System.err.println(o.getStackTrace());  //which exception is getting
			 System.err.println(o.getMessage()); //print that exception
			 System.err.println(o.toString()); //if any string value is getting that will be print
			 
		
	//		 System.out.println("you have entered value of b as "+b+" which is incorrect");	
		//alternative code	 
		 }
		 System.out.println("this is end of code of our programme");
//	 catch(NullPointerException o)
//		 {
//			 System.out.println("you are trying to acces null  String");
//			 //alternative code
//		 }
//		 finally
//		 {
//			 System.out.println("this is end of code of our programme");
//			 
//			 
//			 
//		 }
//		
		
		
	}
	
	
}
