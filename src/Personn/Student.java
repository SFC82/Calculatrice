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
	public void remettre(Media media)
	{
		if(media.isInOrdnung())
		{
			System.out.println("Das Buch wurde zerstört");
		}
		else
		{
			System.out.println("Das Buch annehmen");
		}
	}
    public void location(Media x)
    {
        if(x.isVerfuegbar() && x.isInOrdnung())
        {
            System.out.println("The Student" + " "); //+ super.getName()+ " " + super.getSurname()+ " " + "with matricle" + " "+ this.matricle+ " " + "on the"+" "+ x.dateLoc);
        }
        else
            System.out.println( "actually not available");
    }
    public static boolean reserved(Media x)
    {
            return x.isVerfuegbar() && x.isInOrdnung();

    }
	
}