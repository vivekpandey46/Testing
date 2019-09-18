package Practice;

import javax.sound.sampled.ReverbType;

import Practice1.Reverse;

public class PP {

	public static void main(String[] args) {
		
		String str = "Vivek Pandey";
		
		StringBuffer strb = new StringBuffer(str);
		
		System.out.println(strb.reverse());
		
		System.out.println("-------------------------------");
		
		String[] arr = str.split(" ");
		
		for (int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+"\t");
		}

	}

}
