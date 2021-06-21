package Personn;

import java.util.Date;

/**
 * classe mere du package
 */
public class Person {
    private String name;
    private String surname;
    private Date date;
    private String sex;

   public Person(String _name,String _surname,Date _date,String _sex)
   {
       this.name= _name;
       this.surname= _surname;
       this.date= _date;
       this.sex= _sex;
   }
}
