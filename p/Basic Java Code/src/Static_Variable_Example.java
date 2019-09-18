
public class Static_Variable_Example {
	
	
		    String myClassVar="class or static variable";
			
		   public static void main(String args[]){
			   
			   Static_Variable_Example obj = new Static_Variable_Example();
			   Static_Variable_Example obj2 = new Static_Variable_Example();
			   Static_Variable_Example obj3 = new Static_Variable_Example();
		      
		      //All three will display "class or static variable"
		      System.out.println(obj.myClassVar);
		      System.out.println(obj2.myClassVar);
		      System.out.println(obj3.myClassVar);

		      //changing the value of static variable using obj2
		      obj2.myClassVar = "Changed Text";

		      //All three will display "Changed Text"
		      System.out.println(obj.myClassVar);
		      System.out.println(obj2.myClassVar);
		      System.out.println(obj3.myClassVar);
		   }
		}


