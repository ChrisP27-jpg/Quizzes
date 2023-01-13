package hw06;
import java.util.List;
import java.util.ArrayList;

public class ChoiceQuestion extends Question{
	private List<String> choices;
	private static final String ALFA = "ABCDEFGHIJKLMNOP";
	
	public ChoiceQuestion(String text) {
		super(text);
		choices = new ArrayList<String>();
	}
	
	public void addChoice(String choice, boolean correct) {
		choices.add(choice);
		if (correct == true) {
			String choiceLetter = ALFA.substring(choices.size()-1,choices.size());
			setAnswer(choiceLetter);
		}
	}
	
	public void display() {
		super.display();
		for (int i=0; i<choices.size();i++) {
			String choiceLetter = ALFA.substring(i,i+1);
			System.out.println(choiceLetter + ": " + choices.get(i));
		}
	}
}
