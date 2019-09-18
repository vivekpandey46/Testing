package Practice0;

public class DuplicateCharFromString {

	public static void main(String[] args) {
	
		String str = "vivekke";
		
		char ch[] = str.toCharArray();
		
		for(int i = 0 ;i<ch.length;i++)
		{
			
			for (int j = i+1 ;j<ch.length;j++)
			{
				if (ch[i]==ch[j])
				{
				System.out.println(ch[i] +" is Duplicate Char from String");
				}
			}
		}

	}

}
