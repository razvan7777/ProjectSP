package TestSP;

import com.example.projectsp.ImageProxy;
import com.example.projectsp.models.*;

public interface VisitorTest {

    public void visitTester(Tester tester);
    public void visitManager(Manager manager);
    public void visitProgramator(Programator programator);
    public void visitDepartament(Departament departament);
    public void print();

}
