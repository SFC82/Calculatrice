package Personn;

import java.util.Date;
import Bibliothek.Media;


public class Student extends Person {
    private String matricle;
    private String filiere;

	public Student(String _name, String _surname, Date _date, String _sex, String _matricle, String _filiere)
	{
	    super(_name,_surname, _date, _sex);
	    this.matricle =_matricle;
	    this.filiere= _filiere;
	}
	
	public void acheter (int betrag,  Media  media) 
	{
		 if (media.isVerfuegbar())
		 {
			 System.out.println("acheter");
		 }
		 else 
		 {
			 System.out.println("nicht VBerfugbar");
		 }
	}
}