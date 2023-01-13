package hw06;
import java.util.Scanner;

public class Question {
	private String text;
	private String answer;
	
	public Question(String text) {
		this.text = text;
		this.answer = "";
	}
	
	public void setAnswer(String answer) {this.answer=answer;}
	
	public boolean checkAnswer(String response) {
		response = response.trim();
		if (answer.equalsIgnoreCase(response)) {
			return true;
		}
		else {return false;}
	}
	
	public void display() {
		System.out.println(text);
	}
	
	public boolean presentQuestion(Scanner in) {
		display();
		String response = in.nextLine();
		boolean right = checkAnswer(response);
		System.out.println("Your answer is: "+right);
		return right;
	}
	

}
