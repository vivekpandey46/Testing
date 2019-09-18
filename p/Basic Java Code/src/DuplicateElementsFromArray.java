
public class DuplicateElementsFromArray {

	public static void main(String[] args) {
		
		String s[]={"Vivek", "Kumar", "Pandey","Vivek","Pandey"};
		
		for (int i=0;i<s.length;i++)
		{
			for (int j=i+1;j<s.length;j++)
			{
				if (s[i].equals(s[j]))
				{
					System.out.println("Dupluicate Value is " +s[i]);
				}
			}
			
		}

	}

}
