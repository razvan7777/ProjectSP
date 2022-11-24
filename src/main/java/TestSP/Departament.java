package TestSP;

import java.util.ArrayList;
import java.util.List;

public class Departament implements Angajat{

    private String nume;
    private List<Angajat> angajati= new ArrayList<>();


    public Departament(String nume) {
        this.nume = nume;
    }

    public void add(Angajat angajat){
        angajati.add(angajat);
    }

    @Override
    public void accept(VisitorTest visitor) {
        visitor.visitDepartament(this);
        angajati.forEach(angajat -> angajat.accept(visitor));
    }
}
