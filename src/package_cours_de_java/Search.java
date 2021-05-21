package package_cours_de_java;

import java.util.Arrays;



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
	}
	
	public int find_by_age(int age_to_find)
	{		
		int pos = -1;
		//TODO if found return the position if not return -1
		
		return pos;		
	}
	
	public String toString()
	{
		return Arrays.toString(this.population_ages);
	}
}
