package package_cours_de_java;
import java.util.Scanner;
public class Calculatrice {
	public Calculatrice()	
	{
		System.out.println("Contructor called");
	}
    
    public double addition()
    {
    	
        double result = 0;
        Scanner scanner = new Scanner (System.in);
	        
        	System.out.println("please enter number 1: ");
	        double number1 = scanner.nextDouble();
	        
	        System.out.println("please enter number 2: ");
	        double number2 = scanner.nextDouble();
	        
	        result = number1 + number2;
            
	   scanner.close();
	   
       return result;
    
    
    public double soustraction()
    {
        double result = 0;
        
        Scanner scanner = new Scanner (System.in);
	        
        	System.out.println("please enter number 1: ");
	        double number1 = scanner.nextDouble();
	        
	        System.out.println("please enter number 2: ");
	        double number2 = scanner.nextDouble();
	        
	        result = number1 - number2;
        //TODO implement the soustraction function here ...
	    scanner.close();
        return result;
    }
    
    public double multiplication()
    {
    	Scanner Scan= new Scanner(System.in);
    	double nombre1, nombre2;
        double result = 0;
        //TODO implement the multiplication function here ...
        
        return result;
    }
    
    public double division()
    {
        double result = 0.0;
        //TODO implement the division function here ...
        
        return result;
    }
    
    public int modulo()
    {
        int result = 0;
        //TODO implement the modulo function here ...
        
		scannerVariable.close();
        return result;
    }
    
    public void test()
    {
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
					System.out.println(this.addition());
					System.out.println("Please Select Operation");
				}
				case "soustraction" -> {
					System.out.println(this.soustraction());
					System.out.println("Please Select Operation");
				}
				case "division" -> {
					System.out.println(this.division());
					System.out.println("Please Select Operation");
				}
				case "multiplication" -> {
					System.out.println(this.multiplication());
					System.out.println("Please Select Operation");
				}
				case "modulo" -> {
					System.out.println(this.modulo());
					System.out.println("Please Select Operation");
				}
				case "Exit" -> {
					System.out.println("Thank you");
					System.exit(0);
				}
				default -> System.out.println("ERROR: Please Select Operation");
			}
		}
		operation.close();
    }
}
