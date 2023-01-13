package hw06;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Quiz {
	
	private List<Question> questions;
	
	public Quiz() {
		questions = new ArrayList<Question>();
	}
	
	public void addQuestion(Question newQ) {
		questions.add(newQ);
	}
	
	public void presentQuiz() {
		int score=0;
		Scanner in = new Scanner(System.in);
		for (Question q : questions) {
			if (q.presentQuestion(in)) score++;
		}
		System.out.println("Quiz finished: Score=" + score + "/" + questions.size());
		in.close();
	}

	public static void main(String[] args) {
		Quiz quiz1 = new Quiz();
		Question q1 = new Question("What is the rarest M&M color?");
		q1.setAnswer("brown");
		quiz1.addQuestion(q1);
		ChoiceQuestion q2 = new ChoiceQuestion("In what year were the first Air Jordan sneakers released?");
		q2.addChoice("1979",false);
		q2.addChoice("1984",true);
		q2.addChoice("1996",false);
		q2.addChoice("2003",false);
		q2.addChoice("2014",false);
		quiz1.addQuestion(q2);
		ChoiceQuestion q3 = new ChoiceQuestion("Tennis star Serena Williams won which major tournament while pregant with her first child?");
		q3.addChoice("The Australian Open",true);
		q3.addChoice("America's Cup",false);
		q3.addChoice("The French Open",false);
		q3.addChoice("Wimbledon",false);
		q3.addChoice("The U.S. Open",false);
		quiz1.addQuestion(q3);
		quiz1.addQuestion(new MathQuestion(3,'*',12,15,24,36,144,48));
		quiz1.addQuestion(new MathQuestion(21,'/',4,3,4,5,6,7));
		ChoiceQuestion q6 = new ChoiceQuestion("In which European city would you find Orly airpot?");
		q6.addChoice("Berlin",false);
		q6.addChoice("London",false);
		q6.addChoice("Warsaw",false);
		q6.addChoice("Paris", true);
		q6.addChoice("Oslo",false);
		quiz1.addQuestion(q6);
		quiz1.addQuestion(new MathQuestion(13,'+',32,0,13,32,42,45,65));
		Question q8 = new Question("Where were the Declaration of Independence, the Constitution, and the Bill of Rights stored during World War II?");
		q8.setAnswer("Fort Knox");
		quiz1.addQuestion(q8);
		quiz1.addQuestion(new MathQuestion(21,'-',31,-19,-10,0,10,21));
		ChoiceQuestion q10 = new ChoiceQuestion("What was the first toy to be advertised on television?");
		q10.addChoice("The Hula Hoop",false);
		q10.addChoice("A Slinky",false);
		q10.addChoice("Mr. Potato Head",true);
		q10.addChoice("A Monopoly Game",false);
		q10.addChoice("GameBoy Version 6",false);
		quiz1.addQuestion(q10);
		
		quiz1.presentQuiz();

	}

}
