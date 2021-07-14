package Personn;

import java.util.ArrayList;
import java.util.Date;
import Bibliothek.Media;
import Bibliothek.Statut;

public class Student extends Person {
    private String matricle;
    private String filiere;
    private ArrayList<Media> repertoire;



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
	public Date  location (Media x,Date thisDate)
	{
		Date remiseDate= null;
		Statut statut= x.getPosition();

		switch (statut)
		{
			case VERKAUFT :
				System.out.println(x + " wurde verkauft");
			case VERMIETET:
				System.out.println(x + " wurde schon vermietet");
			case RESERVIERT:
				System.out.println( x +"ist schon reserviert");
			case VERFUEGBAR:
				if (x.isInOrdnung())
				{
					System.out.print ("Media" + x +"has been rented on" + thisDate.toString());
					thisDate.setMonth(thisDate.getMonth() + 2);// les mois vont de 0 a 11 et faire l'année -1900 avant de l'entrée.
					remiseDate = thisDate;
					System.out.print("Media" +x+ "must be returned on" + remiseDate.toString());
					repertoire.remove(x);
					x.setPosition(Statut.VERMIETET);
				}
		}
		return remiseDate;
	}
	public  void reservation(Media x)
	{
		if(repertoire.contains(x))
		{
			Date reservDate = new Date();
			x.setPosition(Statut.RESERVIERT);
			System.out.println("Sie haben das Media" + x+ "on" + reservDate + "reserviert");
		}
		else
		{
			Statut statut = x.getPosition();
			switch (statut)
			{
				case RESERVIERT:
					System.out.println("Das Media" +x+ "wurde reserviert");
				case VERMIETET:
					System.out.println("Das Media" + x+ "wurde vermietet" );
				case VERKAUFT:
					System.out.println("Das Media wurde verkauft");
			}
		}
	}



	
}