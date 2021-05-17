package package_cours_de_java;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		// TODO @Stephane: Implement the programm to test the class calculatrice;
		Calculatrice operationObject= new Calculatrice();
		Scanner operation = new Scanner(System.in);
		System.out.println("addition");
		System.out.println("soustraction");
		System.out.println("division");
		System.out.println("multiplication");
		System.out.println("modulo");
		System.out.println("Exit");
		System.out.println("Please Select Operation:");

		while(operation.hasNext() ){
			String userChoice = operation.next();
			switch (userChoice) {
				case "addition" -> {
					System.out.println(operationObject.addition());
					System.out.println("Please Select Operation");
				}
				case "soustraction" -> {
					System.out.println(operationObject.soustraction());
					System.out.println("Please Select Operation");
				}
				case "division" -> {
					System.out.println(operationObject.division());
					System.out.println("Please Select Operation");
				}
				case "multiplication" -> {
					System.out.println(operationObject.multiplication());
					System.out.println("Please Select Operation");
				}
				case "modulo" -> {
					System.out.println(operationObject.modulo());
					System.out.println("Please Select Operation");
				}
				case "Exit" -> {
					System.out.println("Thank you");
					System.exit(0);
				}
				default -> System.out.println("ERROR: Please Select Operation");
			}

		}
		
	}

}
