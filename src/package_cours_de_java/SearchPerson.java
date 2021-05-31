package package_cours_de_java;

public class SearchPerson {
	private Person[] population;
	private final int population_size;
	
	SearchPerson(int population_size){
		this.population_size = population_size;
		population = new Person[this.population_size];
	}
}
