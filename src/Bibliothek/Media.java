package Bibliothek;

import java.util.ArrayList;
import java.util.Date;

public class Media {
    final private String ID;
    private Date dateLoc;
    private int  frais;
    private Statut position;
    private boolean inOrdnung;


    public Media (String _id,int _frais, Statut position )
    {
        this.ID = _id;
        this.frais = _frais;
        this.position= position;
    }
    public Media (String _id,int _frais, Statut position,Date _dateLoc)
    {
        this.ID = _id;
        this.frais = _frais;
        this.position = position;
        this.dateLoc = _dateLoc;
    }


    public boolean isVerkauft()
    {
        return position.equals(Statut.VERKAUFT);
    }
    public boolean isreserviert()
    {
       return position.equals(Statut.RESERVIERT);
    }

    public boolean isVerfuegbar()
    {
        return position.equals(Statut.VERFUEGBAR);
    }

    public boolean isInOrdnung()
    {
        return inOrdnung ;
    }
    
    public int getfrais()
    {
        return frais;
    }
    public int setfrais() 
    {
    	return frais;
    }

    public String getID()
    {
        return ID;
    }

    public Statut getPosition()
    {
        return position;
    }

    public void setPosition(Statut position)
    {
        this.position = position;
    }

    public Date getDateLoc()
    {
        return dateLoc;
    }

    public void setDateLoc(Date dateLoc)
    {
        this.dateLoc = dateLoc;
    }
}
