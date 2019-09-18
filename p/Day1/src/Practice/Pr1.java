package Practice;

public class Pr1 {

	public static void main(String[] args) {
		
		Object[][] obj = new Object[4][3];
		
		obj[0][0] = "Vivek";
		obj[0][1] = "Kumar";
		obj[0][2] = "Pandey";
		
		
		obj[1][0] = "ABC";
		obj[1][1] = "DEF";
		obj[1][2] = "GHI";
		
		obj[2][0] = "JKL";
		obj[2][1] = "MNO";
		obj[2][2] = "PQR";
		
		obj[3][0] = "STU";
		obj[3][1] = "VWX";
		obj[3][2] = "YZA";
		
		
		System.out.println(obj.length);
		
		System.out.println(obj[0].length);
		
		
		for (int i =0 ;i<obj.length;i++)
		{
			for (int j = 0;j<obj[0].length;j++)
			{
				System.out.print(obj[i][j] + "\t");
			}
			
			System.out.println();
		}
		
		
		
		
		
		
		
		
		

	}

}
