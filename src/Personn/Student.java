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
}
