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
		 if(media.isVerfuegbar())
		 {
			 if(media.isreserviert())
			 {
				 System.out.println("Media ist Schön reserviert");
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
					else if(betrag = media.getfrais())
					{
						System.out.println(" merci pour votre Achat du" +media._id);
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
					//System.out.print("media ist in Ordnung");
					else if(betrag = media.getfrais())
					{
						System.out.println(" merci pour votre Achat du" +media._id);
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
			System.out.println("Das Buch wurde zerstört")
		}
		else
		{
			System.out.println("Das Buch annehmen")
		}
	}
	
}