package firstprogram;

import java.util.Stack;

public class StacksDemo {

	public static void main(String[] args) {

		Stack<String> state = new Stack<>();

		state.push("New york");
		state.push("miami");
		state.push("new orleans");
		state.push("washington DC");
		// stacks operates in a Last in First out arrangement
		// washington would be the element at the top
		System.out.println("Stacks: " + state);

		String poppedElement = state.pop();
		// pop is used to remove or add the element at the top
		System.out.println("topelement: " + poppedElement);

		System.out.println("Stacks: " + state);

		String peekElement = state.peek();
		// peek is used to only view the element at the top
		System.out.println("topelement: " + peekElement);

		System.out.println("Stacks: " + state);

	}

}
