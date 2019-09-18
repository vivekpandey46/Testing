
public class Matrix {

	public static void main(String[] args) {
		
		int i[][]=  new int[3][3];
		
		i[0][0]=1;
		i[0][1]=2;
		i[0][2]=3;
		i[1][0]=4;
		i[1][1]=5;
		i[1][2]=6;
		i[2][0]=7;
		i[2][1]=8;
		i[2][2]=9;
		
		System.out.println("");
		
		for (int row = 0;row < i.length;row ++)
		{
			for (int col = 0 ;col<i[0].length;col++)
			{
				System.out.print(i[row][col] + "\t");
			}
			System.out.println();
		}
		
		
		
		
		
					
		
		
		
		

	}

}
