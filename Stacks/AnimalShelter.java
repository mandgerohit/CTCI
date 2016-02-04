import java.io.*;
import java.util.*;


abstract class Animal{
	
	public String type;
	public int timestamp;
	
}

public class AnimalShelter {
	
	LinkedList<Dog> dogQ=new LinkedList<Dog>();
	LinkedList<Cat> catQ=new LinkedList<Cat>();

	public void enqueue(Animal animal){
		
		if(animal.type=="dog") {
			dogQ.addLast((Dog)animal);
		}
		else catQ.addLast((Cat)animal);
		
	}
	
	public Animal dequeueAny(){
		
		if(catQ.isEmpty() && dogQ.isEmpty()) {
			emptyQueueError("animal");
			return null;
		}
		
		if(catQ.isEmpty()) dequeueDog();
		
		if(dogQ.isEmpty()) dequeueCat();
		
		if(catQ.peek().timestamp<dogQ.peek().timestamp){
			
			return catQ.poll();
		}
		else return dogQ.poll();
		
	}
	
	public Cat dequeueCat(){
		
		if(catQ.peek()!=null){
			return catQ.poll();
		}
		else{
			emptyQueueError("cat");
			return null;
		}
		
	}
	
	public Dog dequeueDog(){
		
		if(dogQ.peek()!=null){
			return dogQ.poll();
		}
		else{
			emptyQueueError("dog");
			return null;
		}
	}
	
	public void emptyQueueError(String type){
		
		if(type=="cat"){
			System.out.println("Cat queue is empty");
			return;
		}
		else {
			if(type=="dog"){
				System.out.println("Dog queue is empty");
				return;
			}
			else {
				System.out.println("Animal queues are empty");
				return;
			}
		}
	}
	
}


class Dog extends Animal{
	
	public Dog(int timestamp){
		
		this.type="dog";
		this.timestamp=timestamp;
	}
	
}

class Cat extends Animal{
	
	public Cat(int timestamp){
		
		this.type="cat";
		this.timestamp=timestamp;
	}
	
}



