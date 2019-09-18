package Practice1;

public class DuplicateStr {

	public static void main(String[] args) {
	
		String str[] = {"Vivek","Vivek", "Pandey", "Kumar", "Vivek"};
		
		for (int i = 0;i<=str.length-1;i++)
		{
			for (int j = i+1;j<=str.length-1;j++)
			{
			
				if(str[i].equals(str[j])&&i!=j)
				{
					System.out.println(str[j]);
				}
			}
			
		}

	}

}
