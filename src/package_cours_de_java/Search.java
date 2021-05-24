package package_cours_de_java;

import java.util.Arrays;

import classetest.$missing$;



public class Search {
	
	private int[] population_ages;
	final int population_size;
	
	public Search (int pop_size)
	{
		population_size = pop_size;
		population_ages = new int[population_size];
		
		for (int pop_indexer=0; pop_indexer<population_size; pop_indexer++) {
			population_ages[pop_indexer] = (int) (Math.random()*100);
		}		
	}
	
	public void sort_by_age()
	{
		//TODO: please just sort no need to print the sorted list here.
		int change= 0;
		int [] population_ages = new int[population_size];
		for(int i=0; i<population_size; i++){
			for(int j= i+1; j<population_size; j++){
				if(population_ages[i] > population_ages[j])
				{
					change = population_ages[j];
					population_ages[j] = population_ages[i];
					population_ages[i] = change;
				}

			}

		}
	}
	public int getPopulation_ages() {
		return this.population_ages;
	}
	public void setFopulation_ages(int[] population_ages) {
		this.population_ages= population_ages;
	}
	public int find_by_age(int age_to_find)
	{		
		int pos = -1;
		for(int pop_indexer=0; pop_indexer<=population_ages.length; pop_indexer++) {
			
			if(population_age[pop_indexer]==age_to_find) {
				System.out.println(pop_indexer);
			}
			else {
		return pos;		
	}
			}
		}
	
	public String toString()
	{
		return Arrays.toString(this.population_ages);
	}
}
