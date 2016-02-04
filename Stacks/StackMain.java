import java.io.*;
import java.util.*;

public class StackMain {

	public static void main(String[] args) throws IOException{

		int[] arr={3,2,7,6,5};
		CreateStack cs=new CreateStack();
		StackNode top=cs.createStack(arr);
		
		/*MultiStack
		MultiStack m=new MultiStack(3);
		
		m.push(0, 3);m.push(0, 4);m.push(0, 1);m.push(1, 6);m.push(2, 5);
		m.push(1, 7);m.push(2, 9);m.push(2, 2);m.push(1, 8);
		m.print();
		*/
		
		/*Min element in the Stack
		StackMin sm=new StackMin();
		sm.push(10);sm.push(7);sm.push(6);sm.push(9);sm.push(3);sm.push(1);
		System.out.println(sm.min());
		*/
		
		/*Stack of Stacks
		SetOfStacks sos = new SetOfStacks(3);
		sos.push(1);sos.push(2);sos.push(3);sos.push(4);sos.push(5);sos.push(6);
		System.out.println(sos.pop().data+" "+sos.pop().data);
		*/
		
		
		
		
		
	}
	
}
