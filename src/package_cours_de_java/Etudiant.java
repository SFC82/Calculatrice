package package_cours_de_java;

public class Etudiant {
    private  String nomEtudiant;
    private int Matricule;
    private int age;
    private int semestre;
    private int sexe;

    public Etudiant (String nomEtudiant, int Matricule, int age,int semestre, int sexe) {
        this.nomEtudiant = nomEtudiant;
        this.Matricule = Matricule;
        this.age = age;
        this.semestre = semestre;
        this.sexe = sexe;
    }

    public String getNomEtudiant() {
        return nomEtudiant;
    }

    public void setNomEtudiant(String nomEtudiant) {
        this.nomEtudiant = nomEtudiant;
    }

    public int getMatricule() {
        return Matricule;
    }

    public void setMatricule(int matricule) {
        Matricule = matricule;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getSexe() {
        return sexe;
    }

    public void setSexe(int sexe) {
        this.sexe = sexe;
    }
}
