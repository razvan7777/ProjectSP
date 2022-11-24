package TestSP;

public class Manager implements Angajat{

    private String nume;
    private Integer salar;

    public Manager(String nume, Integer salar) {
        this.nume = nume;
        this.salar = salar;
    }


    @Override
    public void accept(VisitorTest visitor) {
        visitor.visitManager(this);
    }

    public Integer getSalar() {
        return salar;
    }
}
