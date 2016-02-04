import java.io.*;
import java.util.*;

public class AnimalShelter {
	
	LinkedList<Integer> dogQ=new LinkedList<Integer>();
	LinkedList<Integer> catQ=new LinkedList<Integer>();

	public void enqueue(String animal, int timestamp){
		
		if(animal=="dog") dogQ.add(timestamp);
		else catQ.add(timestamp);
		
	}
	
	public int dequeueAny(){
		
		if(catQ.peek()==null) dequeueDog();
		
		if(dogQ.peek()==null) dequeueCat();
		
		if(catQ.peek()<dogQ.peek()){
			
			return catQ.poll();
		}
		else return dogQ.poll();
		
	}
	
	public int dequeueCat(){
		
		return catQ.poll();
		
	}
	
	public int dequeueDog(){
		
		return dogQ.poll();
		
	}
	
	
}
