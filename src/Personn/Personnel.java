package Personn;

import java.util.Date;

public class Personnel extends Person {
    private int personnelNumber;
    private String post;

    public Personnel(String _name, String _surname, Date _date, String _sex, int _personnelNumber, String _post)
    {
        super( _name,_surname,_date,_sex);

       this.personnelNumber= _personnelNumber;
       this.post= _post;
    }


}