package package_cours_de_java;

public class Personnel {
    private String  personnelName;
    private int personnelNummer;
    private String personnelStelle;
    private String Geschlecht;

    public Personnel (String personnelName, int personnelNummer, String personnelStelle, String Geschlecht ) {
        this.personnelName= personnelName;
        this.personnelNummer= personnelNummer;
        this.personnelStelle= personnelStelle;
        this.Geschlecht =Geschlecht;

    }

    public String getPersonnelName() {
        return personnelName;
    }

    public void setPersonnelName(String personnelName) {
        this.personnelName = personnelName;
    }

    public int getPersonnelNummer() {
        return personnelNummer;
    }

    public void setPersonnelNummer(int personnelNummer) {
        this.personnelNummer = personnelNummer;
    }

    public String getPersonnelStelle() {
        return personnelStelle;
    }

    public void setPersonnelStelle(String personnelStelle) {
        this.personnelStelle = personnelStelle;
    }

    public String getGeschlecht() {
        return Geschlecht;
    }

    public void setGeschlecht(String geschlecht) {
        Geschlecht = geschlecht;
    }
}
