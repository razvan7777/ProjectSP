package TestSP;

public class Programator implements Angajat{

    private String nume;
    private Integer salar;

    public Programator(String nume, Integer salar) {
        this.nume = nume;
        this.salar = salar;
    }


    @Override
    public void accept(VisitorTest visitor) {
        visitor.visitProgramator(this);
    }

    public Integer getSalar() {
        return salar;
    }
}
