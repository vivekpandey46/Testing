package SuperKeyword;



 class Test2 extends Test1
{
	
	 int num = 110;
	 
	 public void printnumber()
	 {
		 System.out.println(super.num);
//		 System.out.println(num);
	 }

	public static void main(String[] args) {
		
		
		Test2 t2 = new Test2();
		t2.printnumber();

	}

}
