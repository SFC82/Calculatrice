package Personn;

import java.util.Date;
import Bibliothek.Media;
import Bibliothek.Statut;

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
		 if(media.isVerfuegbar())
		 {
			 if(media.isreserviert())
			 {
				 System.out.println("Media ist Sch�n reserviert");
			 }
			 else 
			 {
				if(media.isInOrdnung()) 
				{
					if(betrag>media.getfrais())
					{
						int remboursement = betrag - media.getfrais();
						System.out.println("remboursement" +remboursement);
						System.out.println("media ist in Ordnung");
					}
					else if(betrag == media.getfrais())
					{
						System.out.println(" merci pour votre Achat du" + media.getID());
						System.out.println("media ist in Ordnung");
					}
					else
					{
						System.out.println("fehler");
					}
				}
				else 
				{
					if(betrag>media.getfrais())
					{
						int remboursement = betrag - media.getfrais();
						System.out.println("remboursement" +remboursement);
						System.out.println("media ist nicht in Ordnung");
					}
					else if(betrag == media.getfrais())
					{
						System.out.println(" merci pour votre Achat du" +media.getID());
						System.out.println("media ist nicht in Ordnung");
					}
					else
					{
						System.out.println("fehler");
					}
				}
			}
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
			System.out.println("Das Buch wurde zerst�rt");
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
            System.out.println("The Student" + " "); //+ super.getName()+ " " + super.getSurname()+ " " + "with matricle" + " "+ matricle+ " " + "on the"+" "+ x.dateLoc);
        }
        else
            System.out.println( "actually not available");
    }
    public static boolean reserved(Media x)
    {
            return x.isVerfuegbar() && x.isInOrdnung();

    }


	
}