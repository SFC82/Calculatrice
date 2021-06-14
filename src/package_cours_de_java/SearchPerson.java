package package_cours_de_java;

public class SearchPerson {
	public Person[] population;
	private final int population_size;
	
	public int getPopulation_size() {
		return population_size;
	}

	public SearchPerson(int population_size){
		this.population_size = population_size;
		population = new Person[this.population_size];
	}
	
	public void sort_by_age()
	{
		// parcourir toute la polation
		//chaque fois choisir un pivot et effectuer les comparaisons afin de le classer.
		
		for (int indexer=0; indexer < this.population_size-1 ;indexer++)
		{
			//Person pivot = new Person();
			for (int pivot_pos=0; pivot_pos<this.population_size-1; pivot_pos++)
			{
				if ((population[pivot_pos].getAge() > population[pivot_pos+1].getAge()) || 
					(population[pivot_pos].getAge() == population[pivot_pos+1].getAge() && population[pivot_pos].getWeight() > population[pivot_pos+1].getWeight()) )
				{
					// swap
					Person person_tmp = population[pivot_pos];
					population[pivot_pos] = population[pivot_pos+1];
					population[pivot_pos+1] = person_tmp;
				}
			}
			
		}
		return;
	}
	
	public int find_person(Person person)
	{
		int pos = -1;
		for(int indexer=0; indexer<population_size-1; indexer++) {
			if(population[indexer]==person) {
			 pos= indexer;
			}
		}
		return pos;
	}
	
}
 