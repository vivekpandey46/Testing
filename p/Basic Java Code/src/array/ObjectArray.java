package array;

public class ObjectArray {

	public static void main(String[] args) {
		
		Object[] obj = new Object[3];
		
		obj[0] = "Vivek";
		obj[1] = 1;
		obj[2] = 2.9;
		
		for (int i =0 ;i<obj.length;i++)
		{
			System.out.println(obj[i]);
		}
	}
}
