package hw06;

public class MathQuestion extends ChoiceQuestion{
	
	public MathQuestion(int arg1, char op, int arg2, int...choices) {
		super("What is " + arg1 + op + arg2 + " ?");
		int ans = eval(arg1,op,arg2);
		for (int c : choices) {
			addChoice(" " + c,c==ans);
		}
	}
	
	private static int eval(int v1, char op, int v2) {
		if (op=='+') return (v1+v2);
		if (op=='-') return (v1-v2);
		if (op=='*') return (v1*v2);
		if (op=='/') return (v1/v2);
		assert false : "Should never get here.";
		return 0;
	}
}
