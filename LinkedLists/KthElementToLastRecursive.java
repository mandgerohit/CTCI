
public class KthElementToLastRecursive {

	int count=0;
	
	Node kthToLast(Node head, int k){
		
		if(head!=null){
			Node temp=kthToLast(head.next, k);
			if(temp==null){
				count++;
			
				if(count==k){
					//System.out.println(head.data);
					return head;
				}
			}
			return temp;
		}
		return null;
	}
}
