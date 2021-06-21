package Bibliothek;

import java.util.Date;

public class Media {
    private String ID;
    private Date dateLoc;
    private int  frais;
    private boolean achetable;

    public Media (String _id, Date _dateLoc,int _frais,boolean _achetable )
    {
        this.ID= _id;
        this.dateLoc= _dateLoc;
        this.frais = _frais;
        this.achetable= _achetable;
    }

    public boolean isVerkauft()
    {
        return true;
    }
    public boolean isreserviert()
    {
        return true;
    }

    public boolean isVerfügbar()
    {
        return true;
    }

    public boolean isInOrdnung()
    {
        return true;
    }
}
