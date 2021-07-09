package Bibliothek;

import java.util.Date;

public class Media {
    final private String ID;
    private Date dateLoc;
    private int  frais;
    private boolean achetable;
    private boolean inOrdnung;
    private String position;

    public Media (String _id, Date _dateLoc,int _frais,boolean _achetable )
    {
        this.ID= _id;
        this.dateLoc= _dateLoc;
        this.frais = _frais;
        this.achetable= _achetable;
    }
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isVerkauft()
    {
    	
       // if(position.equals("verkauft"))
        return achetable;
    }
    public boolean isreserviert()
    {
       // if(position.equals("reserviert"))
        return dateLoc != null;
    }

    public boolean isVerfuegbar()
    {
        if(position.equals("verfuegbar")) {
            return !isVerkauft() && !isreserviert();
        }
        return false;
    }

    public boolean isInOrdnung()
    {
        return inOrdnung;
    }
    
    public int getfrais(){
    	
    	return frais;
    }
    public int setfrais() 
    {
    	return frais;
    	
    }

    public String getID() {
        return ID;
    }
}
