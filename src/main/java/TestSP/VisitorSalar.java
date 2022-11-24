package TestSP;

public class VisitorSalar implements VisitorTest{

    private Long salarProgramatori = 0L;
    private Long salarManageri= 0L;
    private Long salarTesteri= 0L;
    private Long salarTotalAngajati= 0L;


    @Override
    public void visitTester(Tester tester) {
        salarTesteri += tester.getSalar();
        salarTotalAngajati +=  tester.getSalar();
    }

    @Override
    public void visitManager(Manager manager) {
        salarManageri+=manager.getSalar();
        salarTotalAngajati+=manager.getSalar();
    }

    @Override
    public void visitProgramator(Programator programator) {
        salarProgramatori+= programator.getSalar();
        salarTotalAngajati+=programator.getSalar();
    }

    @Override
    public void visitDepartament(Departament departament) {

    }

    @Override
    public void print(){

        System.out.println("Salariul Programatorilor este: "+salarProgramatori);
        System.out.println("Salariul Testerilor este: "+salarTesteri);
        System.out.println("Salariul Managerilor este: "+salarManageri);
        System.out.println("Salariul Tuturor angajatilor este: "+salarTotalAngajati);

    }
}
