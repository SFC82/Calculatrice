package package_cours_de_java;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
//		// TODO @Stephane: Implement the programm to test the class calculatrice;
//		Calculatrice operationObject= new Calculatrice();
//		operationObject.test();
		
		System.out.println("please enter the population size you desire:");
		Scanner scanner  = new Scanner(System.in);
		
		Search searching = new Search (scanner.nextInt());
		System.out.println("Initial Population: "+ searching);
				
		searching.sort_by_age();
		System.out.println("Sorted population:"+ searching);
		
		System.out.println("please enter age to search:");
		int age_to_search = scanner.nextInt();		
		
		System.out.println("Age "+age_to_search+" ist on position "+searching.find_by_age(age_to_search));
		scanner.close();
		
		searching.getPopulation_size();
	}

}
