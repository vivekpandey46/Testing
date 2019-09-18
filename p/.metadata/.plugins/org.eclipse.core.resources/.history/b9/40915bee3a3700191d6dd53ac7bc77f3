
public class SpiralMatrix {

	
	public void printSpiral(int m,int n,int a[][] )
	{
		
	int i, k= 0, l =0;	
	
	while(k<m && l<n)
	{

		//	Print the first Row 
		
		for (i=l; i<n; i++)
		{
			System.out.print(a[k][i]+"  ");
		}
		k++;
				
		//	Print the last column
		
		for (i = k;i<m;i++)
		{
			System.out.print(a[i][n-1]+" ");
		}
		n--;
		
		//	Print the last row
		
		if(k<m)
		{
			for (i = n-l;i>=l;i--)
			{
				System.out.print(a[m-1][i]+" ");
			}
			m--;
		}
		
		//	Print the first Column
		
		if (l<n)
		{
			for (i=m-l;i>=k;i--)
			{
				System.out.print(a[i][l]+" ");
			}
			l++;
		}
		
	}
		
}
	
public static void main(String[] args) {
	
		int[][] a= {{1,	2,	3},
					{4,	5,	6},
					{7,	8,	9}};

		SpiralMatrix obj = new SpiralMatrix();
		
		obj.printSpiral(3,3,a);
		
		
		
		}
		

	}


