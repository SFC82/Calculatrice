package package_cours_de_java;

import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		// TODO @Stephan: Implement the programm to test the class calculatrice;
		Calculatrice operationObject= new Calculatrice();
		userInput = input.nextDouble();
		Scanner input = new Scanner(System.in);
		double userInput;
		String userChoice;
		System.out.println("Please Select Operation:");
		System.out.println("addition");
		System.out.println("subtraction");
		System.out.println("division");
		System.out.println("multiplication");
		System.out.println("modulo");
		userChoice = input.nextString();

		switch (userChoice()){
			case addition:
				operationObject.addition();
				System.out.println();
				break;
			case subtraction:
				operationObject.subtraction();
				System.out.println();
				break;
			case division:
				operationObject.division();
				System.out.println();
				break;
			case multiplication:
				operationObject.multiplication();
				System.out.println();
				break;
			case modulo:
				operationObject.modulo();
				System.out.println();
				break;
		}
	}

}
