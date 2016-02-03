import java.io.*;
import java.util.*;

public class MultiStack{

	int[] values;
	int[] size;
	int stackCapacity;
	int numStack=3;
	
	public MultiStack(int stackSize){
		
		stackCapacity=stackSize;
		//System.out.println(stackCapacity);
		size=new int[numStack];
		values=new int[stackSize*numStack];
	}
	
	public void push(int stackNum, int n) {
	
		if(stackCapacity==size[stackNum]){
			System.out.println("Stack Overflow Exception");
			return;
		}
		
		int top=indexOfTop(stackNum);
		values[top+1]=n;
		size[stackNum]++;
		
	}

	public int pop(int stackNum) {
		
		if(size[stackNum]==0){
			System.out.println("Stack is Empty");
		}
		
		int top=indexOfTop(stackNum);
		size[stackNum]--;
		return values[top];
		
	}

	public int peek(int stackNum) {
		
		if(size[stackNum]==0){
			System.out.println("Stack is Empty");
		}
		
		int top=indexOfTop(stackNum);
		return values[top];

	}
	
	public int indexOfTop(int stackNum){
		
		int offset=stackNum*stackCapacity;
		int s=size[stackNum];
		
		return offset+s-1;
	}
	
	public void print(){
		for(int i=0;i<=numStack*stackCapacity-1;i++){
			System.out.println(values[i]);
		}
	}
	
	
}
