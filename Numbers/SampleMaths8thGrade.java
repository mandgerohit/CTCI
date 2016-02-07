import java.io.*;

class Question{

int num1=0;
int num2=0;
String question="";
int answer=0;

	public Question(int n1, int n2){

		this.num1=n1;
		this.num2=n2;
		this.question="The sample question is: "+this.num1+" + "+this.num2+" = __";
		this.answer=this.num1+this.num2;
		
	}
}

public class SampleMaths8thGrade {
	
	public void generateQuestion(Question q){
	
		System.out.println(q.question);	
	}
	
	public void displayAnswer(Question q){
		
		System.out.println("The answer for question is "+q.answer);
	
	}

	public static void main(String[] args) throws IOException{

		SampleMaths8thGrade s=new SampleMaths8thGrade();
		Question q1=new Question(5,6);
		Question q2=new Question(8,9);
		Question q3=new Question(3,7);
		
		s.generateQuestion(q1);
		s.displayAnswer(q1);
		s.generateQuestion(q2);
		s.displayAnswer(q2);
		s.generateQuestion(q3);
		s.displayAnswer(q3);
	}

}
