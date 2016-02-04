import java.io.*;

public class CreateStack {
	
	public StackNode createStack(int[] arr){
		
		SimpleStack s=new SimpleStack();
		
		for(int i=0;i<=arr.length-1;i++)
		s.push(arr[i]);
		
		return s.peek();
	}

}