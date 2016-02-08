
public class Node {

	public int data;
	public Node next;
	public Node random;
	
	public Node(int data){
		this.data=data;
	}
	
	public int getData()
	{
		return data;
	}
		
	public void setData(int data)
	{
		this.data=data;
	}
	
	public Node getNext()
	{
		return this.next;
	}
	
	public void setNext(Node next)
	{
		this.next=next;
	}
		
	public void setRandom(Node random){
		
		this.random=random;
	}

	
}

