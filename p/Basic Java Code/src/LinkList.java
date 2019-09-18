import java.util.LinkedList;


public class LinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList list = new LinkedList();
		
		list.add(1);
		list.add("Vivkek");
		list.add(2.0);
		
		System.out.println(list);

		Object first = list.getFirst();
		
		System.out.println(first);
		
		
		Object last= list.getLast();
		
		System.out.println(last);
	}

}
