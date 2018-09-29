package Patiant;

public class Patiant {
    private int id;
    private String name;
    private String surname;
    private String MiddleName;
    private String telephone;
    private String Diagnostic;

    Patiant(int id,String name,String surname,
            String middleName,String telephone,String diagnostic){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.MiddleName = middleName;
        this. telephone = telephone;
        this.Diagnostic = diagnostic;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getDiagnostic() {
        return Diagnostic;
    }
}
