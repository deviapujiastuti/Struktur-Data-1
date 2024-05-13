package pekan2;

import java.util.Scanner;
import java.util.Stack;

public class StackPostfix {

	public static int StackPostfixEvaluate(String expretion) {
		Stack<Integer> s = new Stack<Integer>();
		Scanner input = new Scanner (expretion);
		while (input.hasNext()) {
			if (input.hasNext()) { // an operand (integer)
				s.push(input.nextInt());
			}else {
				String operator = input.next();
				int operand2 = s.pop();
				int operand1 = s.pop();
				if (operator.equals("+")) {
					s.push(operand1  + operand2);
				}else if (operator.equals("-")) {
					s.push(operand1  - operand2);
				}else if (operator.equals("*")) {
					s.push(operand1  * operand2);
				}else {
					s.push(operand1  / operand2);
				}
				}
				}
		return s.pop();
	}
	public static void main(String[] args) {
		System.out.println("hasil postfix= "+StackPostfixEvaluate("5 2 4 * + 7 -"));
	}
}


