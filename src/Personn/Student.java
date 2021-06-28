package Personn;

import java.util.Date;

public class Student extends Person {
    private String matricle;
    private String filiere;

    public Student(String _name, String _surname, Date _date, String _sex, String _matricle, String _filiere)
    {
        super(_name,_surname, _date, _sex);
        this.matricle =_matricle;
        this.filiere= _filiere;
    }
    public void location(Media x)
    {
        if(x.isVerfuegbar() && x.isInOrdnung())
        {
            System.out.println("The Student " + " " + super.getName()+ " " +super.getSurname() + " " + "with matricle" + " "+ "rented"+ x + " " + "on the" + " " + super.getDate() );
        }
        else
            System.out.println( "actually not available");
    }
    public  boolean reserved(Media x)
    {
        return x.isVerfuegbar() && x.isInOrdnung();
    }

}
