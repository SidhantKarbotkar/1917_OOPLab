
public class LinkedList {

	private Node head;
	
	public void add(Integer data) {
		Node new_node = new Node(data);
		if(head==null) head = new_node;
		else
		{
			Node node=head;
			while(node.next != null) node=node.next;
			node.next=new_node;
		}
	
	}
	
	public void print() {
		Node list=head;
		if(head==null) 
		{
			System.out.println("\nYour List is empty...!\n");
			return;
		}
		System.out.println("\nLinked list :-\n");
		while(list.next!=null)
		{
			System.out.println(list.data);
			list=list.next;
		}
		System.out.println(list.data);
	}

	public int Arr_Size() {
		int count=0;
		Node t_node=head;
		while(t_node!=null) 
		{
			t_node = t_node.next;
			count++;
		}
		return count;
	}
}
