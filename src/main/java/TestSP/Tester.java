package TestSP;

public class Tester implements Angajat{

    private String nume;
    private Integer salar;


    public Tester(String nume, Integer salar) {
        this.nume = nume;
        this.salar = salar;
    }



    @Override
    public void accept(VisitorTest visitor) {
        visitor.visitTester(this);
    }

    public Integer getSalar() {
        return salar;
    }
}
