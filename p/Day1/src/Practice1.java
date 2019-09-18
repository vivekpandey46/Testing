
public class Practice1 {

	public static void main(String[] args) {
		
		
		String[] str = new String[1];
		
		str[0] = "VivekPAndey";
		
		char[] ch = str[0].toCharArray();
		
		System.out.println(ch.length);
		
		for (int i = 0;i<ch.length;i++)
		{
			for (int j = 1;j<ch.length-1;j++)
			{
				if (ch[i]==ch[j])
				{
					System.out.println(ch[i]);
				}
			}
		}
	}
		
}